package my.com.tm.dice.ipay.microservices.dao;

import my.com.tm.dice.ipay.microservices.dao.mapper.TinyUrlResultExtractor;
import my.com.tm.dice.ipay.microservices.exception.UrlExpiredException;
import my.com.tm.dice.ipay.microservices.model.TinyUrl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Thaniswaran Raja Goval on 12/20/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */
public class TinyUrlDao {

    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("sqlQueries")
    private Properties sqlQueries;

    Logger logger = Logger.getLogger(TinyUrlDao.class);

    public TinyUrl getLongUrl(String tinyUrlStr) throws UrlExpiredException {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
        String getLongUrlSql = sqlQueries.getProperty("tinyurl.get.longurl");
        Map<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("tinyUrl", tinyUrlStr);
        TinyUrlResultExtractor tinyUrlResultExtractor = new TinyUrlResultExtractor();
        TinyUrl tinyUrl = (TinyUrl) template.query(getLongUrlSql, paramMap, tinyUrlResultExtractor);

        //todo validation for url expiry
        //todo if expired throw UrlExpiredException

        logger.debug("TinyUrl: " + tinyUrl.toString());
        return tinyUrl;
    }
}

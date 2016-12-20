package my.com.tm.dice.ipay.microservices.dao.mapper;

import my.com.tm.dice.ipay.microservices.model.TinyUrl;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Thaniswaran Raja Goval on 12/20/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */
public class TinyUrlResultExtractor implements ResultSetExtractor {
    @Override
    public TinyUrl extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        TinyUrl tinyUrl = new TinyUrl();
        //set values to tinyUrl
        return tinyUrl;
    }
}

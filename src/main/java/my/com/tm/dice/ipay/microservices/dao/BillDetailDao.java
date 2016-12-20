package my.com.tm.dice.ipay.microservices.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Properties;

//import org.springframework.jndi.JndiObjectFactoryBean;

/**
 * Created by Thaniswaran Raja Goval on 12/20/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */
@Repository
public class BillDetailDao {
    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("sqlQueries")
    private Properties sqlQueries;

    Logger logger = Logger.getLogger(BillDetailDao.class);


}

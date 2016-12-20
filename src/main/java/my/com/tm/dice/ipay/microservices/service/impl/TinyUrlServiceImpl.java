package my.com.tm.dice.ipay.microservices.service.impl;

import my.com.tm.dice.ipay.microservices.service.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Properties;

/**
 * Created by Thaniswaran Raja Goval on 12/16/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */

@Service
@Qualifier(value = "tinyUrlService")
public class TinyUrlServiceImpl implements TinyUrlService{

    @Autowired
    @Qualifier("appProperties")
    private Properties appProperties;

    @Override
    public String getDomainUrl() {
        return appProperties.getProperty("domain.url");
    }
}

package my.com.tm.dice.ipay.microservices.controller;

import my.com.tm.dice.ipay.microservices.service.BillDetailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Thaniswaran Raja Goval on 12/16/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */

@RestController
@RequestMapping("/smsipay")
public class IpaySmsController {
    @Autowired
    @Qualifier("billDetailService")
    private BillDetailService billDetailService;



    Logger logger = Logger.getLogger(ProductController.class);


}

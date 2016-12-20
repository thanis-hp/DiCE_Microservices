package my.com.tm.dice.ipay.microservices.service.impl;

import my.com.tm.dice.ipay.microservices.service.BillDetailService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Thaniswaran Raja Goval on 12/16/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */
@Service
@Qualifier(value = "billDetailService")
public class BillDetailServiceImpl implements BillDetailService {
}

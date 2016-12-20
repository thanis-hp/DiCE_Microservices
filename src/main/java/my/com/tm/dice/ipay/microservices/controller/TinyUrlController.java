package my.com.tm.dice.ipay.microservices.controller;

import com.google.common.hash.Hashing;
import my.com.tm.dice.ipay.microservices.service.TinyUrlService;
import org.apache.commons.validator.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thaniswaran Raja Goval on 12/16/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */

@RestController
@RequestMapping("/util/url_util")
public class TinyUrlController {
    @Autowired
    @Qualifier("tinyUrlService")
    private TinyUrlService tinyUrlService;

    @RequestMapping(method = RequestMethod.POST, value = "/util/url_util/tiny")
    @ResponseBody
    public Map<String, Object> getTinyUrl(@RequestParam(value = "longUrl") String longUrl) {
        Map<String, Object> responseContent = new HashMap<String, Object>();
        final UrlValidator urlValidator = new UrlValidator(new String[]{"http", "https"});
        if (urlValidator.isValid(longUrl)) {
            final String id = Hashing.murmur3_32().hashString(longUrl, StandardCharsets.UTF_8).toString();
            //--> todo: save to database
            responseContent.put("tinyUrl", tinyUrlService.getDomainUrl() + id);
            return responseContent;
        } else {
            //todo throw exception to fail entire transaction
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/util/url_util/long")
    @ResponseBody
    public Map<String, Object> getLongUrl(@RequestParam(value = "tinyUrl") String tinyUrl) {
        Map<String, Object> responseContent = new HashMap<String, Object>();
        final UrlValidator urlValidator = new UrlValidator(new String[]{"http", "https"});
        if (urlValidator.isValid(tinyUrl)) {
            //--> todo: load longUrl from database
            String longUrl = "";
            responseContent.put("longUrl", longUrl);
            return responseContent;
        } else {
            //todo throw exception to fail entire transaction
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/util/url_util/tinyBatch")
    @ResponseBody
    public Map<String, Object> getTinyUrlBatch(@RequestParam(value = "longUrlBatch") List<String> longUrlBatch) {
        Map<String, Object> responseContent = new HashMap<String, Object>();
        List<String> tinyUrlBatch = new ArrayList<>();

        if (null != longUrlBatch && !longUrlBatch.isEmpty()) {
            for (String longUrl : longUrlBatch) {

                final UrlValidator urlValidator = new UrlValidator(new String[]{"http", "https"});
                if (urlValidator.isValid(longUrl)) {
                    final String id = Hashing.murmur3_32().hashString(longUrl, StandardCharsets.UTF_8).toString();
                    //--> todo: save to database
                    tinyUrlBatch.add(tinyUrlService.getDomainUrl() + id);
                } else {
                    //todo throw exception to fail entire transaction
                    return null;
                }
            }
            responseContent.put("tinyUrlBatch", tinyUrlBatch);
        }
        return null;
    }
}

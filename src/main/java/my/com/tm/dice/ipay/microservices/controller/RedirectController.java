package my.com.tm.dice.ipay.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by Thaniswaran Raja Goval on 12/16/2016.
 * Email: thaniswaran.raja-goval@hpe.com
 */

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class RedirectController {

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public void redirect(@PathVariable String id, HttpServletResponse resp) throws Exception {
            final String url = "";
            //call db for tiny url object
            //check url expiry
            //if expired redirect to expired page
            //if not found, show expired page
            //if found redirect to page
            if (url != null)
                resp.sendRedirect(url);
            else
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }


}

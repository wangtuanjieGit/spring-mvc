package com.shenming.spring.contrller;

import com.sun.xml.internal.ws.encoding.ContentType;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/portal")
public class Mycontroller {

    @RequestMapping(method = RequestMethod.GET, path = "/getname")
    public void printSomething(HttpServletRequest request, HttpServletResponse response){
        Logger logger = Logger.getLogger(Mycontroller.class);
        response.setContentType("text/html; charset=utf-8");
        try {
            response.getWriter().append("shenming");
            logger.info(String.format("response is %s", request.getSession().getId()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

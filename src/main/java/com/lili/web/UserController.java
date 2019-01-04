package com.lili.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lili
 * @dta 2019/1/2-13:20
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "hello";
    }
}

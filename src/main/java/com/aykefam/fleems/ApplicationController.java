package com.aykefam.fleems;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping("/index")
    public String home(){
        return "index";
    }
}

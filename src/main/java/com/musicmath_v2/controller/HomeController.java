package com.musicmath_v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/" + "")
    public String getHome() {
        return "index";
    }

    @GetMapping("/getMusicTheory")
    public String getHomeSite() {
        return "musicTheory";
    }

}

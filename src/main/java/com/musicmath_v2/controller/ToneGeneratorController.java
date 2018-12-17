package com.musicmath_v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToneGeneratorController {

    @GetMapping("/getToneGenerator")
    public String getToneGenerator() {
        return "toneGenerator";
    }
}

package com.musicmath_v2.controller;


import com.musicmath_v2.repository.DottedBpmRepo;
import com.musicmath_v2.repository.RevRepo;
import com.musicmath_v2.repository.TripletBpmRepo;
import com.musicmath_v2.service.RevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CalculateController {

    @Autowired
    RevRepo rR;

    @Autowired
    DottedBpmRepo dbR;

    @Autowired
    TripletBpmRepo tbR;

    @GetMapping("/getCalculateBpm")
    public String getCalculateBpm() {

        return "calculateBpm";
    }

    @PostMapping("/postCalculateBpm")
    public String calculateBpmResult(@RequestParam("bpm") double bpm) {

        rR.revBpm(bpm);
        dbR.dottedBpm(bpm);
        tbR.tripletBpm(bpm);
        return "redirect:/getCalculateBpmResult";
    }

    @GetMapping("/getCalculateBpmResult")
    public String printCalculateResult(Model model) {
        model.addAttribute("arrayOfRevtimes", rR.getAll());
        model.addAttribute("arrayOfDottedtimes", dbR.getAll());
        model.addAttribute("arrayOfTripletTimes", tbR.getAll());
        return "calculateBpmResult";
    }
}

package com.musicmath_v2.controller;


import com.musicmath_v2.domain.FreqEntity;
import com.musicmath_v2.repository.FreqRepo;
import com.musicmath_v2.service.FreqService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NoteFreqController {


    FreqRepo fR = new FreqService();


    FreqEntity f = new FreqEntity();

    @GetMapping("/getNoteFreq")
    public String getNoteFreq() {

        return "noteFreq";
    }

    @PostMapping("/noteFreq")
    public String noteFreqResult(@RequestParam("note") String note) {
        fR.freqCal(note);
        return "redirect:/noteFreqResult";
    }

    @GetMapping("/noteFreqResult")
    public String getNoteFreqResult(Model model) {
        model.addAttribute("noteName", f.getNoteName());
        model.addAttribute("arrayOfFreq", fR.getAll());
        return "noteFreqResult";
    }
}

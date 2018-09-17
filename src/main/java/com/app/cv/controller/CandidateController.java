package com.app.cv.controller;

import com.app.cv.model.Candidate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class CandidateController {

    private final List<String> country = Arrays.asList("Argentina", "Australia", "Brazil", "Canada", "China", "India", "Kazakhstan",
            "Sudan", "United States");

    @GetMapping("/")
    public String candidateForm(Model model) {
        model.addAttribute("candidate", new Candidate());
        model.addAttribute("countries", country);
        return "index";
    }

    @PostMapping("/")
    public String submitCandidate(@ModelAttribute Candidate candidate) {
        return "cv";
    }
}

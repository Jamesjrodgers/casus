package com.topicus.casus.controller;

import com.topicus.casus.model.recept;
import com.topicus.casus.services.receptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class receptController {


    @Autowired
    private receptService receptService;


    @GetMapping("/recept")
    public String medicijn(Model model) {
        List<recept> receptList = receptService.findAll();

        model.addAttribute("recept", receptList);
        return "redirect:/show";
    }
}

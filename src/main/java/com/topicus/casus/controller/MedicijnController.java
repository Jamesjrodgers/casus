package com.topicus.casus.controller;

import com.topicus.casus.model.medicijn;
import com.topicus.casus.services.medicijnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MedicijnController {

    @Autowired
    private medicijnService medicijnService;


    @GetMapping("/index")
    public String medicijn(Model model) {
        List<medicijn> medicijnList = medicijnService.findAll();

        model.addAttribute("medicijn", medicijnList);
        return "index";
    }

    @PostMapping("/index/recept")
    public String addNew(medicijn medicijn) {
        medicijnService.save(medicijn);
        return "redirect:/show";
    }

    @RequestMapping("/show")
    public String medicijnPrint(Model model) {
        List<medicijn> medicijnList = medicijnService.findAll();

        model.addAttribute("medicijnPrint", medicijnList);
        return "show";
    }


}

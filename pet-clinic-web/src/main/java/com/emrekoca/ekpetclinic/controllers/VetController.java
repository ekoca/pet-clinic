package com.emrekoca.ekpetclinic.controllers;

import com.emrekoca.ekpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emre.
 */
@Controller
public class VetController {

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    private final VetService vetService;

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String vets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}

package com.petcllinic.jgspringpetclinic.controllers;

import com.petclinic.jgspringpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/owners")
    public String listOfOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

}

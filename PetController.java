package org.wecancodeit.virtualpet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.repositories.PetRepository;

import jakarta.annotation.Resource;

@Controller
public class PetController {

    @Resource
    private PetRepository petRepository;

    @RequestMapping("/pet")
    public String displayPets(Model model) {
        model.addAttribute("pet", petRepository.findAll());
        return "petView";
    }

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
}

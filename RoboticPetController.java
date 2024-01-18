package org.wecancodeit.virtualpet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.repositories.RoboticPetRepository;

import jakarta.annotation.Resource;

@Controller
public class RoboticPetController {

    @Resource
    private RoboticPetRepository roboticPetRepository;

    @RequestMapping("/robot")
    public String displayPets(Model model) {
        model.addAttribute("robot", roboticPetRepository.findAll());
        return "RoboticPetView";
    }

    public RoboticPetController(RoboticPetRepository roboticPetRepository) {
        this.roboticPetRepository = roboticPetRepository;
    }

}

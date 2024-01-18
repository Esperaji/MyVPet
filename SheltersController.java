package org.wecancodeit.virtualpet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.models.Shelters;
import org.wecancodeit.virtualpet.repositories.SheltersRepository;

import jakarta.annotation.Resource;

@Controller
public class SheltersController {

    @Resource
    private SheltersRepository sheltersRepository;

    @RequestMapping({ "", "/", "/shelters" })
    public String displayShelters(Model model) {
        model.addAttribute("shelters", sheltersRepository.findAll());
        return "sheltersView";

    }

@RequestMapping({"/shelter/{id}" })
    public String displayShelter(@PathVariable long id, Model model) {
        model.addAttribute("shelter", sheltersRepository.findById(id).get());
        return "shelterView";

    }

   
    public SheltersController(SheltersRepository sheltersRepository) {
        this.sheltersRepository = sheltersRepository;
    }

    @GetMapping("/shelter/edit/{id}")
    public String editShelter(@PathVariable long id, Model model) {
        Shelters shelters = sheltersRepository.findById(id).get();
        model.addAttribute("shelter", shelters);
        return "editSheltersView";
    }

    
}

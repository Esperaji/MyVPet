package org.wecancodeit.virtualpet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpet.repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Controller
public class VolunteerController {

    @Resource
    private VolunteerRepository volunteerRepository;

    @RequestMapping("/volunteer")
    public String displayVolunteers(Model model) {
        model.addAttribute("volunteer", volunteerRepository.findAll());
        return "volunteerView";

    }

    public VolunteerController(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }
}

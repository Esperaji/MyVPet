package org.wecancodeit.virtualpet.controllers;

import org.springframework.stereotype.Controller;
import org.wecancodeit.virtualpet.repositories.LivePetRepository;

import jakarta.annotation.Resource;

@Controller
public class LivePetController {
    
    @Resource
    private LivePetRepository livePetRepository;

   


   
}

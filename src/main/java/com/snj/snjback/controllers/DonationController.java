package com.snj.snjback.controllers;

import com.snj.snjback.dtos.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.services.DonationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/donation")
public class DonationController {
    private final DonationService service;

    public DonationController(DonationService service) {
        this.service = service;
    }

    @PostMapping(path = {"", "/", "/add"})
    public DonationDTO insert(@Valid @RequestBody DonationForm form) {
        System.out.println("On essaie d'inserer");
        return service.insert(form);
    }

}

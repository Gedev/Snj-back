package com.snj.snjback.controllers;

import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.services.DonationService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/donation")
public class DonationController {
    private final DonationService service;

    public DonationController(DonationService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public DonationDTO getOneParam(@PathVariable String id) {
        return service.getOne(id);
    }

    @GetMapping(params = "id")
    public DonationDTO getOne(@RequestParam String id) {
        return service.getOne(id);
    }

    @PostMapping(path = {"", "/", "/add"})
    public DonationDTO insert(@Valid @RequestBody DonationForm form) {
        System.out.println("On essaie d'inserer");
        return service.insert(form);
    }

    @GetMapping(path = {"", "/", "/all"})
    public List<DonationDTO> getAll() {
        return service.getAll();
    }

    @PatchMapping(path = {"", "/", "/update"})
    public DonationDTO update(@Valid @RequestBody DonationForm form) {
        //form.setPassword(encoder.encode(form.getPassword()));
        return service.update(form);
    }

    @DeleteMapping("/{id}")
    public DonationDTO delete(@PathVariable String id) {
        //return service.deleteSecure(id, auth);
        return service.delete(id);
    }

}

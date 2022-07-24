package com.snj.snjback.controllers;

import com.snj.snjback.entity.dto.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;
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
    public DonationDTO getOneParam(@PathVariable Long id) {
        return service.getOne(id);
    }

    @GetMapping(params = "id")
    public DonationDTO getOne(@RequestParam Long id) {
        System.out.println("==>getById<===");
        return service.getOne(id);
    }

    @PostMapping(path = {"", "/", "/add"})
    public DonationDTO insert(@Valid @RequestBody DonationForm form) {
        return service.insert(form);
    }

    @GetMapping(path = {"", "/", "/all"})
    public List<DonationDTO> getAll() {
        return service.getAll();
    }

    @PatchMapping(path = {"", "/", "/update"}, params = {"id"})
    public DonationDTO update(@Valid @RequestBody DonationUpdateForm form, @RequestParam Long id) {
        //form.setPassword(encoder.encode(form.getPassword()));
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public DonationDTO delete(@PathVariable Long id) {
        //return service.deleteSecure(id, auth);
        return service.delete(id);
    }

}

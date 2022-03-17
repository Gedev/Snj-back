package com.snj.snjback.mappers;

import com.snj.snjback.documents.Donation;
import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import org.springframework.stereotype.Component;

@Component
public class DonationMapper implements Mapper<Donation, DonationDTO, DonationForm>{
    @Override
    public DonationDTO entityToDTO(Donation entity) {
        return DonationDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .hasCategory(entity.isHasCategory())
                .quantity(entity.getQuantity())
                .amount(entity.getAmount())
                .isCash(entity.isCash())
//                .products(entity.getProducts())
//                .projects(entity.getProjects())
                .donator(entity.getDonator())
                .build();
    }

    @Override
    public Donation formToEntity(DonationForm form) {
        return Donation.builder()
                .id(form.getId())
                .title(form.getTitle())
                .hasCategory(form.isHasCategory())
                .quantity(form.getQuantity())
                .amount(form.getAmount())
                .isCash(form.isCash())
//                .products(form.getProducts())
//                .projects(form.getProjects())
                .donator(form.getDonator())
                .build();
    }
}

package com.snj.snjback.services;

import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;
import org.springframework.stereotype.Service;

@Service
public interface DonationService extends ServiceCRUD<Long, DonationForm, DonationUpdateForm, DonationDTO>{
}

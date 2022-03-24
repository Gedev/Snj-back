package com.snj.snjback.services;

import com.snj.snjback.documents.dto.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;

public interface DonationService extends ServiceCRUD<String, DonationForm, DonationUpdateForm, DonationDTO>{
}

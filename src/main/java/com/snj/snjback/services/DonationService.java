package com.snj.snjback.services;

import com.snj.snjback.dtos.DonationDTO;
import com.snj.snjback.forms.DonationForm;
import com.snj.snjback.forms.updateForms.DonationUpdateForm;

public interface DonationService extends ServiceCRUD<Long,DonationForm, DonationUpdateForm,DonationDTO>{
}

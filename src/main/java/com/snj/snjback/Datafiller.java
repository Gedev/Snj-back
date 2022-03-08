package com.snj.snjback;

import com.snj.snjback.documents.Address;
import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.Donation;
import com.snj.snjback.documents.User;
import com.snj.snjback.repositories.CategorieRepository;
import com.snj.snjback.repositories.DonationRepository;
import com.snj.snjback.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Datafiller implements InitializingBean {

    private final UserRepository userRepository;
    private final DonationRepository donationRepository;
    private final CategorieRepository categorieRepository;

    public Datafiller(UserRepository userRepository, DonationRepository donationRepository, CategorieRepository categorieRepository) {
        this.userRepository = userRepository;
        this.donationRepository = donationRepository;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        User user = User.builder()
                .id(String.valueOf(ObjectId.get()))
                .firstname("Pacifique")
                .lastname("Ngabo")
                .birthdate(LocalDate.now())
                .address(Address.builder()
                        .country("country")
                        .postCode("7690")
                        .town("town")
                        .street("street")
                        .build()
                )

        .build();
        userRepository.insert(user);

        Donation donation = Donation.builder()
                .id(ObjectId.get())
                .title("First donation")
                .hasCategory(false)
                .amount(5000)
                .isCash(true)
                .donator(user)
                .build();
        donationRepository.insert(donation);
        Category category=Category.builder()
                .id(ObjectId.get())
                .name("Nettoyage")
                .build();
        categorieRepository.insert(category);

    }
}

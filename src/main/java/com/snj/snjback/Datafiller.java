package com.snj.snjback;

import com.snj.snjback.repositories.CategoryRepository;
import com.snj.snjback.repositories.DonationRepository;
import com.snj.snjback.repositories.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Datafiller implements InitializingBean {

    private final UserRepository userRepository;
    private final DonationRepository donationRepository;
    private final CategoryRepository categorieRepository;

    public Datafiller(UserRepository userRepository, DonationRepository donationRepository, CategoryRepository categorieRepository) {
        this.userRepository = userRepository;
        this.donationRepository = donationRepository;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        /*User user = User.builder()
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
                .id(String.valueOf(ObjectId.get()))
                .title("First donation")
                .hasCategory(false)
                .amount(5500)
                .isCash(true)
                .donator(user)
                .build();
        donationRepository.insert(donation);
        Category category=Category.builder()
                .id(String.valueOf(ObjectId.get()))
                .name("Nettoyage")
                .build();
        categorieRepository.insert(category);*/

    }
}

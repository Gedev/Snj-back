package com.snj.snjback;

import com.snj.snjback.documents.Address;
import com.snj.snjback.documents.Category;
import com.snj.snjback.documents.Project;
import com.snj.snjback.repositories.CategoryRepository;
import com.snj.snjback.repositories.DonationRepository;
import com.snj.snjback.repositories.ProjectRepository;
import com.snj.snjback.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
public class Datafiller implements InitializingBean {

    private final UserRepository userRepository;
    private final DonationRepository donationRepository;
    private final CategoryRepository categoryRepository;

    private final ProjectRepository projectRepository;

    public Datafiller(UserRepository userRepository, DonationRepository donationRepository, CategoryRepository categoryRepository, ProjectRepository projectRepository) {
        this.userRepository = userRepository;
        this.donationRepository = donationRepository;
        this.categoryRepository = categoryRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Project project = Project.builder()
                .id(String.valueOf(ObjectId.get()))
                .title("Premier projet")
                .creationDate(LocalDate.now())
                .ClosingDate(LocalDate.of(2055, 12, 10))
                .descrition("First project Datafiller")
                .category(Category.builder()
                        .id(String.valueOf(ObjectId.get()))
                        .build())
                .address(Address.builder()
                        .country("country")
                        .postCode("7690")
                        .town("town")
                        .street("street")
                        .build()
                )

                .build();

        projectRepository.insert(project);
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

package com.snj.snjback;

import com.snj.snjback.documents.Address;
import com.snj.snjback.documents.User;
import com.snj.snjback.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Datafiller implements InitializingBean {

    private final UserRepository userRepository;

    public Datafiller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        User user = User.builder()
                .id(ObjectId.get())
                .firstname("Gérald")
                .lastname("Dev")
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
    }
}

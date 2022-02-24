package com.snj.snjback;

import com.snj.snjback.documents.User;
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
                .firstname("Samirah")
                .lastname("Mas")
                .birthdate(LocalDate.now())
                .build();
        userRepository.insert(user);
    }
}

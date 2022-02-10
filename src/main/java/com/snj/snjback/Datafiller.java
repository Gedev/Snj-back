package com.snj.snjback;

import com.snj.snjback.User;
import com.snj.snjback.UserRepository;
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
        System.out.println("On passe bien dans le datafiller");

        User user = User.builder()
                .id(0L)
                .firstname("Samirah")
                .lastname("Mas")
                .birthdate(LocalDate.now())
                .build();
        userRepository.insert(user);
    }
}

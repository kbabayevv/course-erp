package com.webperside.courseerpbackend;

import com.webperside.courseerpbackend.models.enums.user.UserStatus;
import com.webperside.courseerpbackend.models.mybatis.user.User;
import com.webperside.courseerpbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseErpBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CourseErpBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        User user = User.builder()
//                .name("Nurlan")
//                .surname("Babayev")
//                .status(UserStatus.ACTIVE)
//                .roleId(2L)
//                .email("email1@gmail.com")
//                .phoneNumber("+994555555556")
//                .password("1235")
//                .build();
//
//       userRepository.insert(user);
    }
}

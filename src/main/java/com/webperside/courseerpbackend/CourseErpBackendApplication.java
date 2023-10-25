package com.webperside.courseerpbackend;

import com.webperside.courseerpbackend.models.enums.user.UserStatus;
import com.webperside.courseerpbackend.models.mybatis.user.User;
import com.webperside.courseerpbackend.services.security.AccessTokenManager;
import com.webperside.courseerpbackend.services.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class CourseErpBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CourseErpBackendApplication.class, args);
    }

//    private final SecurityProperties securityProperties;

    private final AccessTokenManager accessTokenManager;
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
//        User user = User.builder()
//                .name("Zaur")
//                .surname("Mustafazade")
//                .password(passwordEncoder.encode("123123"))
//                .roleId(1L)
//                .phoneNumber("+994557414141")
//                .status(UserStatus.ACTIVE)
//                .email("zaurmusatafa1999@gmail.com")
//                .build();

//        userService.insert(user);
//        System.out.println(userService.getByEmail("zaurmusatafa1999@gmail.com"));








//        final String token = accessTokenManager.generate(user);
//
//        System.out.println(token);
//
//        System.out.println(
//                accessTokenManager.read(token).get("email", String.class)
//        );


//        log.info("public key {}", securityProperties);
//        KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
//        keyGenerator.initialize(2048);
//        KeyPair kp = keyGenerator.genKeyPair();
//        PublicKey publicKey = kp.getPublic();
//        PrivateKey privateKey = kp.getPrivate();
//
//        String encodedPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
//        String encodedPrivateKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());
//
//        System.out.println(convertToPublicKey(encodedPublicKey));
//
//        System.out.println();
//
//        System.out.println(convertToPrivateKey(encodedPrivateKey));

    }

    private static String convertToPrivateKey(String key) {
        StringBuilder result = new StringBuilder();
        result.append("-----BEGIN PRIVATE KEY-----\n");
        result.append(key);
        result.append("\n-----END PRIVATE KEY-----");
        return result.toString();
    }

    private static String convertToPublicKey(String key) {
        StringBuilder result = new StringBuilder();
        result.append("-----BEGIN PUBLIC KEY-----\n");
        result.append(key);
        result.append("\n-----END PUBLIC KEY-----");
        return result.toString();
    }
}

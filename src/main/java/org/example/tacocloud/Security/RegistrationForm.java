package org.example.tacocloud.Security;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.tacocloud.model.User;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@Slf4j
public class RegistrationForm {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder){
        User user = new User(
                username, passwordEncoder.encode(password),
                fullname, street, city, state, zip, phone);
        System.out.println(user);
        return user;
    }
}

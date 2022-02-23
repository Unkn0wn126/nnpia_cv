package cz.upce.fei.nnpia.cv02.bankdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    EmailService emailService;

    public void createUser(){
        System.out.println("User created");
        emailService.sendEmail("lukas.milar@upce.cz", "Your user account in our bank " +
                "has been created!");
    }
}

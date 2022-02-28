package cz.upce.fei.nnpia.cv02.bankdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    EmailService emailService;

    public void createProfile(){
        System.out.println("Profile created");
        emailService.sendEmail("lukas.milar@upce.cz", "User profile for you " +
                "has been created, good luck!");
    }
}

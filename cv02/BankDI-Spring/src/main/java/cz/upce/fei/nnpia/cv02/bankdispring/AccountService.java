package cz.upce.fei.nnpia.cv02.bankdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    EmailService emailService;

    public void createAccount(){
        System.out.println("Account created");
        emailService.sendEmail("lukas.milar@upce.cz", "Bank account for you " +
                "has been created, good luck!");
    }
}

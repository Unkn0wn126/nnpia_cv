package cz.upce.fei.nnpia.cv02;

public class UserAccountService {
    EmailService emailService;

    public UserAccountService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createUser(){
        emailService.sendEmail("lukas.milar@upce.cz",
                "Welcome to our social network, user account created!");
    }
}

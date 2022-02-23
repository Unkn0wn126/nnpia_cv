package cz.upce.fei.nnpia.cv02;

public class UserService {
    EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createUser(){
        emailService.sendEmail("lukas.milar@upce.cz",
                "Welcome to our bank, user account created!");
    }
}

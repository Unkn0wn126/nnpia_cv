package cz.upce.fei.nnpia.cv02;

public class AccountService {
    EmailService emailService;

    public AccountService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createAccount(){
        emailService.sendEmail("lukas.milar@upce.cz",
                "Bank account created, good luck!");
    }
}

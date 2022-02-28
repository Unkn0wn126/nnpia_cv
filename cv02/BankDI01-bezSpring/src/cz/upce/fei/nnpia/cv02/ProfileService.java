package cz.upce.fei.nnpia.cv02;

public class ProfileService {
    EmailService emailService;

    public ProfileService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createProfile(){
        emailService.sendEmail("lukas.milar@upce.cz",
                "User profile created!");
    }
}

package cz.upce.fei.nnpia.cv02;

public class DependencyInjector {
    //navrhovy vzor singleton
    private static UserAccountService userAccountService;
    private static ProfileService profileService;
    private static EmailService emailService;

    private  static  EmailService getEmailService(){
        if (emailService == null){
            emailService = new EmailService();
        }
        return  emailService;
    }

    private static UserAccountService getUserService(){
        if (userAccountService == null){
            userAccountService = new UserAccountService(getEmailService());
            // lazy object creation
        }
        return userAccountService;
    }

    private static ProfileService getAccountService(){
        if (profileService == null){
            profileService = new ProfileService(getEmailService());
        }
        return profileService;
    }

    public static ISocialApp getBankApp() {
        return new SocialApp(getUserService(), getAccountService());
    }
}

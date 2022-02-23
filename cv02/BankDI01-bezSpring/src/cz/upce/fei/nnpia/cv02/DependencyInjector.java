package cz.upce.fei.nnpia.cv02;

public class DependencyInjector {
    //navrhovy vzor singleton
    private static UserService userService;
    private static AccountService accountService;
    private static EmailService emailService;

    private  static  EmailService getEmailService(){
        if (emailService == null){
            emailService = new EmailService();
        }
        return  emailService;
    }

    private static UserService getUserService(){
        if (userService == null){
            userService = new UserService(getEmailService());
            // lazy object creation
        }
        return userService;
    }

    private static AccountService getAccountService(){
        if (accountService == null){
            accountService = new AccountService(getEmailService());
        }
        return accountService;
    }

    public static IBankApp getBankApp() {
        return new BankApp(getUserService(), getAccountService());
    }
}

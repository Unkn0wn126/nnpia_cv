package cz.upce.fei.nnpia.cv02;

public class BankApp implements IBankApp {
    UserService userService;
    AccountService accountService;

    public BankApp(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    public static void main(String[] args) {
        IBankApp bankApp = DependencyInjector.getBankApp();
        bankApp.process();
    }

    @Override
    public void process() {
        userService.createUser();
        accountService.createAccount();
    }
}

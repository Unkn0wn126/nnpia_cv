package cz.upce.fei.nnpia.cv02.bankdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BankDiSpringApplication {

    @Autowired
    UserService userService;

    @Autowired
    AccountService accountService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("cz.upce.fei.nnpia.cv02.bankdispring");

        context.getBean(BankDiSpringApplication.class).process();
    }

    private void process() {
        userService.createUser();
        accountService.createAccount();
    }

}

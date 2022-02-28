package cz.upce.fei.nnpia.cv02.bankdispring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BankDiSpringApplication {

    @Autowired
    UserAccountService userAccountService;

    @Autowired
    ProfileService profileService;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("cz.upce.fei.nnpia.cv02.bankdispring");

        context.getBean(BankDiSpringApplication.class).process();
    }

    private void process() {
        userAccountService.createUser();
        profileService.createProfile();
    }

}

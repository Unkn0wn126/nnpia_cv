package cz.upce.fei.nnpia.cv02;

public class SocialApp implements ISocialApp {
    UserAccountService userAccountService;
    ProfileService profileService;

    public SocialApp(UserAccountService userAccountService, ProfileService profileService) {
        this.userAccountService = userAccountService;
        this.profileService = profileService;
    }

    public static void main(String[] args) {
        ISocialApp bankApp = DependencyInjector.getBankApp();
        bankApp.process();
    }

    @Override
    public void process() {
        userAccountService.createUser();
        profileService.createProfile();
    }
}

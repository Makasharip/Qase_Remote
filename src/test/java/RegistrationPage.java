import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public RegistrationPage openPage() {
        open("/login");
        return this;
    }
}

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("OnlyTest")
public class RemoteTest extends TestBase{
    private final RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void openQase () {

        registrationPage.openPage();
        $(By.className("FzFLHc")).click();
        $(By.className("VV3w3Z")).exists();

    }


}

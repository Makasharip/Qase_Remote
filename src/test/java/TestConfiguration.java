import com.codeborne.selenide.Configuration;
public class TestConfiguration {
    public static void applyConfig() {

        Configuration.pageLoadStrategy = "eager";

        Configuration.baseUrl = System.getProperty("baseURL", "https://app.qase.io");
//        Configuration.remote = System.getProperty("webDriverHost", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "114.0");
//        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
//        Configuration.timeout = 10000;

    }
}

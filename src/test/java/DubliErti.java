import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class DubliErti {
    @Test
    public void one (){
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://my.silknet.com/login");
        $(byName("_username")).setValue("msimonishvili@silknet.com");
        $(byName("_password")).setValue("Paroli13");
        $(byName("_submit")).click();
        $(".prod-label").click();


        sleep (5000);


    }
}

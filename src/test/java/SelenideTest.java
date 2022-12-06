import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class SelenideTest {

    @Test
    public void test() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");

    }
}

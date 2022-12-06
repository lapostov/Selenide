import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {

    @Test
    public void test() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        $("input[placeholder='Город']").setValue("Владивосток");
        $("input[placeholder='Дата встречи']").setValue("06.12.2022");
        $("input[name='name']").setValue("Александр Сергеевич");
        $("input[name='phone']").setValue("+79271620864");
        $x("//span[@class='checkbox__box']").click();
        $x("//span[@class='button__text']").click();
        String text = $x("//div[@class='notification__content']").should(visible, Duration.ofSeconds(15)).getText();
        Assertions.assertEquals("Встреча успешно забронирована на 09.12.2022", text.trim());



    }
}

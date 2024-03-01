package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasePage {

    public String randomEmail(){
        return "tester" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyHHmmss")) + "@tester.com";
    }

}

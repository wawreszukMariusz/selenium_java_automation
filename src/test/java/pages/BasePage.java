package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BasePage {

    public String dateNow(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyHHmmss"));
    }

}

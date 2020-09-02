package mx.com.multiva.sipare.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedDate {

    Date date = new Date();
    //LocalDate.now().toString()
    String fullDateFormated = new SimpleDateFormat("yyyy-MM-dd").format(date);

    public String getFullDateFormated() {
        return fullDateFormated;
    }
}

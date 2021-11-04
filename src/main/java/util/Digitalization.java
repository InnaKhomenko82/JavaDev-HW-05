package util;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Digitalization {
    public static Long getLong(String string){
        return Long.valueOf(string);
    }

    public static Integer getInteger(String string){
        return Integer.valueOf(string);
    }

    @SneakyThrows
    public static LocalDate getDate(String string){
        return LocalDate.parse(string);
    }
}

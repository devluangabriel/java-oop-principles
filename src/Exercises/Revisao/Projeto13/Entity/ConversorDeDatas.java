package Exercises.Revisao.Projeto13.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversorDeDatas {

    public static String paraFormatoBR(LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }

    public static String paraFormatoISO(LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        return data.format(formatter);
    }

    public static String stringParaLocalDateTime(String data, String formato){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDateTime date = LocalDateTime.parse(data);
        return formatter.format(date);
    }

}

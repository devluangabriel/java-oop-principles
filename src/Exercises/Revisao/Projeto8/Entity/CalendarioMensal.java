package Exercises.Revisao.Projeto8.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalendarioMensal {
    private LocalDate data;

    public CalendarioMensal(LocalDate data) {
        this.data = data;
    }

    //estudar lista, como pegar posição, entre outros
    public List<LocalDate> listarSegundasFeiras() {
        List<LocalDate> segundas = new ArrayList<>();
        if (data.getDayOfWeek().getValue() == 5) {
            segundas.add(data);
        }
        return segundas;
    }
}

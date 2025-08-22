package Exercises.Revisao.Projeto2.Entity;

import java.time.LocalTime;

public class RelogioDigital {
    private LocalTime horaAtual;

    public RelogioDigital(Integer horarAtual, Integer minuto, Integer segundo) {
        LocalTime horaAtualLocal = LocalTime.of(horarAtual, minuto, segundo);
        this.horaAtual = horaAtualLocal;
    }

    public RelogioDigital(Integer horarAtual, Integer minuto) {
        LocalTime horaAtualLocal = LocalTime.of(horarAtual, minuto, 0);
        this.horaAtual = horaAtualLocal;
    }

    public LocalTime getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(LocalTime horaAtual) {
        this.horaAtual = horaAtual;
    }

    public void exibirHora12Horas() {
        if (horaAtual.getHour() == 0) {
            System.out.println("Hora atual: 12 AM");
        } else if (horaAtual.getHour() >= 1 && horaAtual.getHour() <= 11) {
            System.out.println("Hora atual: " + horaAtual.getHour() + " AM");
        } else if (horaAtual.getHour() == 12) {
            System.out.println("Hora atual: 12 PM");
        } else {
            System.out.println("Hora atual: " + (horaAtual.getHour() - 12) + " PM");
        }
    }
}

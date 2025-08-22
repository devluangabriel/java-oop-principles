package Exercises.Revisao.Projeto7.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Agendamento {
    private String description;
    private LocalDateTime dataHora;
    private Integer duracaoMinutes;

    public Agendamento(String description, LocalDateTime dataHora, Integer duracaoMinutes) {
        this.description = description;
        this.dataHora = dataHora;
        this.duracaoMinutes = duracaoMinutes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getDuracaoMinutes() {
        return duracaoMinutes;
    }

    public void setDuracaoMinutes(Integer duracaoMinutes) {
        this.duracaoMinutes = duracaoMinutes;
    }

    public LocalDateTime getHorarioFim(){
        this.dataHora = LocalDateTime.now();
        return this.dataHora;
    }

    public Boolean ocorreNoMesmoDia(Agendamento outro){

        if(getDataHora().toLocalDate().getDayOfWeek() == outro.getDataHora().toLocalDate().getDayOfWeek() && getDataHora().getMinute() == outro.getDataHora().getMinute()){
            return true;
        } else {
            return false;
        }
    }

}

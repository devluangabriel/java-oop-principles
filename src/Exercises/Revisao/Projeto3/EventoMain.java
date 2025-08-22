package Exercises.Revisao.Projeto3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventoMain {
    private String  nome;
    private LocalDateTime dataHora;

    public EventoMain(String nome, LocalDateTime dataHora) {
        this.nome = nome;
        this.dataHora = dataHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Boolean ehFuturo(){
        LocalDateTime dateatual = LocalDateTime.now();
        if(dataHora.isAfter(dateatual)){
            return true;
        } else {
            return false;
        }
    }

    public String formatarData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd, MM, yyyy");
        return dataHora.format(formatter);
    }
}

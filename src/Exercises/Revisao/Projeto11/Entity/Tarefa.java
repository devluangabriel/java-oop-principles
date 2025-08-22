package Exercises.Revisao.Projeto11.Entity;

import java.time.LocalDate;

public class Tarefa {
    private String descricao;
    private LocalDate dataLimite;
    private Integer priority;

    public Tarefa(String descricao, LocalDate dataLimite, Integer priority) {
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.priority = priority;
    }

    public Tarefa(String descricao, LocalDate dataLimite) {
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.priority = 1;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean estaAtrsada() {
        if (dataLimite.isBefore(LocalDate.now())) {
            return true;
        } else  {
            return false;
        }
    }
}


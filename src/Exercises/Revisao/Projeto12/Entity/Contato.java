package Exercises.Revisao.Projeto12.Entity;

import java.time.LocalDate;

public class Contato {
    private String nome;
    private String telefone;
    private LocalDate dataAdicionado;

    public Contato(String nome, String telefone, LocalDate dataAdicionado) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataAdicionado = dataAdicionado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataAdicionado() {
        return dataAdicionado;
    }

    public void setDataAdicionado(LocalDate dataAdicionado) {
        this.dataAdicionado = dataAdicionado;
    }
}

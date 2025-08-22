package Exercises.Revisao.Projeto1.Entity;

import java.time.LocalDate;
import java.time.Period;

public class PessoaProject {
    private String nome;
    private LocalDate dataNascimento;

    public PessoaProject(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer calcularIdade() {
        LocalDate date = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, date);
        return periodo.getYears();
    }
}

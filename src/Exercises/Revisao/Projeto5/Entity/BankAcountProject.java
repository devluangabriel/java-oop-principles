package Exercises.Revisao.Projeto5.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class BankAcountProject {
    private String titular;
    private Double saldo;
    private LocalDateTime createdDate;

    public BankAcountProject(String titular, Double saldo, LocalDateTime createdDate) {
        this.titular = titular;
        this.saldo = saldo;
        this.createdDate = createdDate;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void depositar(double valor){
       if(valor <= 0){
           System.out.println("Erro: valor invalido");
       } else {
           this.saldo += valor;
       }
    }

    public void sacar (double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
        } else  {
            this.saldo -= valor;
        }
    }

    public void diasDesdeaCriacao(){
        Period periodo = Period.between(createdDate.toLocalDate(), LocalDate.now());
        System.out.println("Conta created a " + periodo.getDays() + " days");
    }
}

package Exercises.Revisao.Projeto4.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProdutoProjeto {
    private String name;
    private Double price;
    private LocalDate validation;

    public ProdutoProjeto(String name, Double price, LocalDate validation) {
        this.name = name;
        this.price = price;
        this.validation = validation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getValidation() {
        return validation;
    }

    public void setValidation(LocalDate validation) {
        this.validation = validation;
    }

    public Boolean estaVencido(){
        LocalDate dataHora = LocalDate.now();
        if(validation.isBefore(dataHora)){
            return true;
        } else {
            return false;
        }
    }

    public void aplicarDescounto(Integer porcentagem){
        Double desconto = (price * porcentagem) / 100;
        this.setPrice(getPrice() - desconto);
    }

    public void aplicarDescounto(){
        Double desconto = (price * 5) / 100;
        this.setPrice(getPrice() - desconto);
    }
}

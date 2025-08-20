package Exercises.Classes.Entity;

public class BankAcount {
    public String titular;
    public Double saldo = 0.0;

    public Double deposite(Double valor){
        this.saldo += valor;
        return saldo;
    }

    public Double sacarMoney(Double valor){
        if (saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
        return saldo;
    }

    public void exibirSaldo(){
        System.out.println(saldo);
    }
}

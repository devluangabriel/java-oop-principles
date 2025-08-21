package Exercises.EncapConsThis.zeroum.Entity;

public class Bank {
    private Integer numberAcount;
    private String titularName;
    private Double balanceInitial = 0.0;

    public Bank(Integer numberAcount, String titularName) {
        this.numberAcount = numberAcount;
        this.titularName = titularName;
    }

    public Bank(Integer numberAcount, String titularName, Double balanceInitial) {
        this.numberAcount = numberAcount;
        this.titularName = titularName;
        this.balanceInitial = balanceInitial;
    }

    public Integer getNumberAcount() {
        return numberAcount;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public Double getBalanceInitial() {
        return balanceInitial;
    }

    public void setBalanceInitial(Double balanceInitial) {
        this.balanceInitial = balanceInitial;
    }

    public double deposit(double amount) {
        setBalanceInitial(getBalanceInitial() + amount);
        System.out.println("Depisto no valor de : " + amount + " realizado com sucesso, na sua conta titular : " + getTitularName());
        return getBalanceInitial();
    }

    public double saque(double amount) {
        if (getBalanceInitial() <= 0) {
            System.out.println("Saldo insuficiente, retiramos do seu limite");
            System.out.println("Saque no valor de : " + amount + " realizado com sucesso, na sua conta titular : " + getTitularName());
            setBalanceInitial((getBalanceInitial() - amount) - 5.0);
        } else {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Saque no valor de : " + amount + " realizado com sucesso, na sua conta titular : " + getTitularName());
            setBalanceInitial((getBalanceInitial() - amount) - 5.0);
        }
        return getBalanceInitial();
    }
    
    public String mostrarInfo(){
        return "Number Acount: " + getNumberAcount() + " Titular: " + getTitularName() + " Balance: " + getBalanceInitial();
    }


}

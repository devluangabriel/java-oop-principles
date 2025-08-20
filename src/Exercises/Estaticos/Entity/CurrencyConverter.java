package Exercises.Estaticos.Entity;

public class CurrencyConverter {
    public static final double dolar = 5.98;
    public static final double iof = 1.1;
    public double real;

    public double convert(Double real, Double dolar){
        double base = real * dolar;
        return base * (1 + (iof / 100));
    }

    public void result(){
        System.out.printf("Valor a se pago em reais e : %.2f%n", convert(real, dolar));
    }
}

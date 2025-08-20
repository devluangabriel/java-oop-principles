package Exercises.Classes.Entity;

public class ConversorTemperatura {

    public static Integer converteTemp(Integer temperatura){
        double temperaturaConvertido = (temperatura * 1.8 + 32);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaConvertido);
        return  (int) temperaturaConvertido;
    }

}

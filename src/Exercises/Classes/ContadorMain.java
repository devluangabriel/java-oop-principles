package Exercises.Classes;

import Exercises.Classes.Entity.Contador;

public class ContadorMain {
    public static void main(String[] args) {
        Contador.total += 1;
        Contador.getTotal();
    }
}

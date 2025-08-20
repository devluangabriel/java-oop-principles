package Exercises.Classes.Entity;

public class Contador {
    public static Integer total = 0;

    public static Integer getTotal(){
        System.out.println("Total de contadores: " + Contador.total);
        return total;
    }
}

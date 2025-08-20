package Exercises.Classes.Entity;

public class Pessoa {
    public String name;
    public Integer age;

    public void aniversario() {
        System.out.println(++age);
    }
}

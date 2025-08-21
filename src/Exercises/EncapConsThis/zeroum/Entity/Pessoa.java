package Exercises.EncapConsThis.zeroum.Entity;

public class Pessoa {
    private String name;
    private Integer age;

    public Pessoa(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pessoa(String name) {
        this.name = name;
        this.age = 0;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }

    public void exibirInfo(Boolean b) {
        if (b == true) {
            System.out.println("Nome: " + name);
            System.out.println("Idade: " + age);
        } else {
            System.out.println("Nome: " + name);
        }
    }
}

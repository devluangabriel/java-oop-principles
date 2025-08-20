package Exercises.Classes.Entity;

public class Produto {
    public String nome;
    public Double preco;

    public Double aplicarDesconto(Double porcentual){
        preco -= (preco * porcentual / 100);
        System.out.println("Preco atual: " + preco);
        return preco;
    }
}

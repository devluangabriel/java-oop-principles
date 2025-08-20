package Exercises.Classes;

import Exercises.Classes.Entity.Produto;

public class ProductMain {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "TV 59 PL";
        produto.preco = 50.0;

        produto.aplicarDesconto(10.0);
    }
}

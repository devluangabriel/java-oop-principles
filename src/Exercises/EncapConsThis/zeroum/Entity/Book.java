package Exercises.EncapConsThis.zeroum.Entity;

public class Book {
    private String title;
    private String author;
    private double valor;

    public Book(String title, String author, double valor) {
        this.title = title;
        this.author = author;
        this.valor = valor;
    }

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
        this.valor = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + this.title);
        System.out.println("author: " + this.author);
    }

    public void exibirInfo(boolean b){
        if (b == true) {
            System.out.println("Nome: " + this.title);
            System.out.println("author: " + this.author);
            System.out.println("Valor: " + this.valor);
        } else  {
            System.out.println("Nome: " + this.title);
            System.out.println("author: " + this.author);
        }
    }
}

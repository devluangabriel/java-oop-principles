package Exercises.EncapConsThis.zeroum.Entity;

public class ProdutoTwo {
    private String nome;
    private Double valor;

    public ProdutoTwo(String nome, Double valor) {
        this.nome = nome;
        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 1.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void aplicarDesconto(double porcentagem) {
        double teste = (getValor() * porcentagem) / 100;
        this.valor = getValor() - teste;
    }

    public void aplicarDesconto() {
        double teste = (getValor() * 10) / 100;
        this.valor = getValor() - teste;
    }
}

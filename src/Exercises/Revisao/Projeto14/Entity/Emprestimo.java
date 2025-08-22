package Exercises.Revisao.Projeto14.Entity;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean estaAtrsado(){
        LocalDate atual = LocalDate.now();
        if(atual.isAfter(this.dataEmprestimo)){
            return true;
        } else {
            return false;
        }
    }
}

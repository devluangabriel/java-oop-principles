package Exercises.Classes.Entity;

import java.util.Vector;

public class Aluno {
    public String nome;
    public Double nota;

    public Boolean fuiAprovado() {
        if (nota >= 60 ) {
            System.out.println("Aluno aprovado");
            return true;
        }  else {
            System.out.println("Aluno reprovado");
            return false;
        }
    }

    public static void mediaTurma(Double[] teste){
        double soma = 0.0;
        for (int i = 0; i < teste.length; i++) {
            soma += teste[i];
        }

        System.out.println("Media Turma: " + (soma/ teste.length));
    }
}

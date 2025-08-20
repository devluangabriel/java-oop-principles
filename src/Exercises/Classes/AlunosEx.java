package Exercises.Classes;

import Exercises.Classes.Entity.Aluno;

import java.util.Vector;

public class AlunosEx {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nota = 6.00;
        aluno.fuiAprovado();

        Double[] nts = {2.00, 5.00, 6.00, 2.00};
        Aluno.mediaTurma(nts);
    }
}

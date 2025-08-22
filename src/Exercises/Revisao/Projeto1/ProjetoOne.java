package Exercises.Revisao.Projeto1;

import Exercises.EncapConsThis.zeroum.Entity.Pessoa;
import Exercises.Revisao.Projeto1.Entity.PessoaProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjetoOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu data de nascimento: ");
        String dataNascimento = sc.nextLine();

        LocalDate dbo = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        PessoaProject db = new PessoaProject(nome, dbo);

        System.out.println("Sua idade atual e : " + db.calcularIdade());
        sc.close();
    }
}

package Exercises.Revisao.Projeto12;

import Exercises.Revisao.Projeto12.Entity.AgendaTelefonica;
import Exercises.Revisao.Projeto12.Entity.Contato;

import java.time.LocalDate;

public class ContatoMain {
    public static void main(String[] args) {
        Contato contatocleiton = new Contato("CLeiton", "22222", LocalDate.now());
        Contato contatojoao = new Contato("JOao", "111111", LocalDate.parse("2025-07-29"));

        AgendaTelefonica sc =  new AgendaTelefonica();
        sc.add(contatocleiton);
        sc.add(contatojoao);

        sc.listarContatos();
    }
}

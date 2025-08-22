package Exercises.Revisao.Projeto12.Entity;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List contatos;

    List<Contato> ctt = new ArrayList<>();

    public void add(Contato contato) {
        ctt.add(contato);
    }

    public void listarContatos(){
        for (int i = 0; i < ctt.size(); i++) {
            System.out.println(ctt.get(i));
        }
    }
}

package Exercises.Revisao.Projeto15.Entity;

import Exercises.Revisao.Projeto14.Entity.Livro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HistoricoAcesso {
    // e possivel iniciar uma lista diretamente no objeto
    private static List acessos = new ArrayList();

    public void registrarAcess(LocalDateTime horaDoRegister) {
        acessos.add(horaDoRegister);
    }

    public void mostrarFirtsEndAcess(){
        System.out.println(acessos.getLast());
    }

    public static void viewAcessDeterminedDay(LocalDateTime day){
        List listaNova = new ArrayList();

        for (int i = 0; i < acessos.size() ; i++) {
            if(acessos.get(i).equals(day)){
                listaNova.add(acessos.get(i));
            }
        }

        for(int i = 0; i < listaNova.size(); i++){
            System.out.println(listaNova.get(i));
        }
    }
}

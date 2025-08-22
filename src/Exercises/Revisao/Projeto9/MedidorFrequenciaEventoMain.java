package Exercises.Revisao.Projeto9;

import Exercises.Revisao.Projeto9.Entity.MedidorFrequenciaEvento;

import java.time.LocalDateTime;
import java.util.List;

public class MedidorFrequenciaEventoMain {
    public static void main(String[] args) {
        MedidorFrequenciaEvento main = new MedidorFrequenciaEvento();
        MedidorFrequenciaEvento f = new MedidorFrequenciaEvento();
        MedidorFrequenciaEvento p = new MedidorFrequenciaEvento();
        main.addEvento(main);
        main.addEvento(f);
        main.addEvento(p);

        //Estudar sobre List.

    }
}

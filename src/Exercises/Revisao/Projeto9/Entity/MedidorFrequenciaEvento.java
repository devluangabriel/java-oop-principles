package Exercises.Revisao.Projeto9.Entity;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;

public class MedidorFrequenciaEvento {
    private List eventos;

    public void addEvento(MedidorFrequenciaEvento eventoParametro) {
        if (eventos.equals(eventoParametro) ) {
            System.out.println("Vaga indisponivel");
        } else  {
            eventos.add(eventoParametro);
        }

    }


}

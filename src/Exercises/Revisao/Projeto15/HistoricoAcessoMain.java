package Exercises.Revisao.Projeto15;

import Exercises.Revisao.Projeto15.Entity.HistoricoAcesso;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HistoricoAcessoMain {
    public static void main(String[] args) {
        HistoricoAcesso historico = new HistoricoAcesso();
        historico.registrarAcess(LocalDateTime.parse("2025-08-12T21:39:40"));
        historico.registrarAcess(LocalDateTime.parse("2025-08-15T21:39:40"));
        historico.registrarAcess(LocalDateTime.parse("2021-02-13T21:39:40"));
        historico.registrarAcess(LocalDateTime.parse("2025-08-19T21:39:40"));
        historico.registrarAcess(LocalDateTime.parse("2025-08-21T21:39:49"));

       historico.mostrarFirtsEndAcess();


        HistoricoAcesso.viewAcessDeterminedDay(LocalDateTime.parse("2025-08-21T21:39:49"));
    }
}

package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now(); //me retorna a data atual do sistema
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();


            if(dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }

        if (proximoEvento != null) {
            System.out.println("O proximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }

    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();


        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 8), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 9), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 11), "Evento 6", "Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2024,8, 12), "Evento 7", "Atração 7");
        agendaEventos.adicionarEvento(LocalDate.of(2024,8, 13), "Evento 8", "Atração 8");

        agendaEventos.obterProximoEvento();
    }

}

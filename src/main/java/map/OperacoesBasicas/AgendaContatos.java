package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
            System.out.println("Contato removido");
        } else {
            System.out.println("Lista vazia");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Contato 1", 12345678);
        agendaContatos.adicionarContatos("Contato 2", 87654321);
        agendaContatos.adicionarContatos("Contato 2", 13245678);
        agendaContatos.adicionarContatos("Contato 4", 84657132);
        agendaContatos.adicionarContatos("Contato 5", 0);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Contato 4");
    }
}

package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato c: contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

//        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 31353236);
        agendaContatos.adicionarContato("Camila Silva", 15678912);
        agendaContatos.adicionarContato("Camila", 54941213);
        agendaContatos.adicionarContato("Maria Silva", 12345678);
        agendaContatos.adicionarContato("Camila DIO", 87654321);

//        Set<Contato> outraAgenda = agendaContatos.pesquisarPorNome("Maria");
//        System.out.println(outraAgenda);

        System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("Maria Silva", 11111111));

        agendaContatos.exibirContatos();
    }
}

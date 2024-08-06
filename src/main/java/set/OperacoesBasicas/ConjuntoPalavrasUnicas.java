package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "conjuntoPalavrasUnicasSet=" + conjuntoPalavrasUnicasSet +
                '}';
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;

        for (String p : conjuntoPalavrasUnicasSet) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = palavra;
                break;
            }
        }

        conjuntoPalavrasUnicasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicasSet);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");

        conjuntoPalavrasUnicas.removerPalavra("Palavra 1");

        conjuntoPalavrasUnicas.verificarPalavra("Palavra 4");
    }
}

package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add((numero));
    }

    public int calcularSoma() {
        int somaTotal = 0;

        if(!numeroList.isEmpty()) {
            for (int i : numeroList) {
                somaTotal += i;
            }
        }

        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int numeroAnterior = Integer.MIN_VALUE;

        for (int i : numeroList) {
            if (numeroAnterior < i)
                numeroAnterior = i;
        }

        return numeroAnterior;
    }

    public int encontrarMenorNumero() {
        int numeroAnterior = Integer.MAX_VALUE;

        for (int i : numeroList) {
            if (numeroAnterior > i)
                    numeroAnterior = i;
        }

        return  numeroAnterior;
    }

    public void exibirNumeros() {
        System.out.println(numeroList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);

        somaNumeros.exibirNumeros();
    }
}

package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for (Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemList.remove(i);
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Item i : itemList) {
            valorTotal += i.getPreco()*i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("item 1", 2.50, 5);
        carrinhoDeCompras.adicionarItem("item 2", 5, 1);
        carrinhoDeCompras.adicionarItem("item 3", 1, 2);

        carrinhoDeCompras.exibirItens();

    }
}

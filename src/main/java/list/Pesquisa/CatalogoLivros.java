package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {

                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorAno.add(l);
            }
        }

        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
            }
        }

        return livroPorTitulo;
    }


    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Brilho", "Rodolfo",2014);
        catalogoLivros.adicionarLivro("Sol", "Rodolfo",2010);
        catalogoLivros.adicionarLivro("Gelo", "Lucia",2020);
        catalogoLivros.adicionarLivro("Fogo", "Diana",2024);
        catalogoLivros.adicionarLivro("Ar", "Solange",2005);

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2011,2019));
    }
}

package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvites;

    public Convidado(String nome, int codigoConvites) {
        this.nome = nome;
        this.codigoConvites = codigoConvites;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvites() {
        return codigoConvites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvites() == convidado.getCodigoConvites();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvites());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvites=" + codigoConvites +
                '}';
    }
}

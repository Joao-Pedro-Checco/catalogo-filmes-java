package com.screenmatch.modelos;

import com.screenmatch.excessoes.ErroDeConversaoDeAnoException;

public class Titulo {
    protected final String nome;
    private final int ano;
    private final int duracao;

    public Titulo(TituloOmdb meuTituloOmdb) throws ErroDeConversaoDeAnoException {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Ano inválido! Ano não pode ter mais de 04 caracteres.");
        } else if (meuTituloOmdb.year().length() < 4) {
            throw new ErroDeConversaoDeAnoException("Ano inválido! Ano não pode ter menos de 03 caracteres.");
        }

        this.ano = Integer.parseInt(meuTituloOmdb.year());
        this.duracao = this.validaDuracao(meuTituloOmdb);
    }

    private int validaDuracao(TituloOmdb meuTituloOmdb) {
        if (meuTituloOmdb.runtime().length() == 7) {
            return Integer.parseInt(meuTituloOmdb.runtime().substring(0, 3));
        }
        return Integer.parseInt(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return String.format("(Nome: '%s' - Ano: %d - Duração: %d min)", this.nome, this.ano, this.duracao);
    }
}

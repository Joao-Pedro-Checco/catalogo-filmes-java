package com.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Filme extends Titulo {
    @SerializedName("Year")
    private final int anoLancamento;
    private final String diretor;
    private final int duracaoMinutos;

    public Filme(String nome, int anoLancamento, String diretor, int duracaoMinutos) {
        super(nome);
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Lançamento: " + this.anoLancamento);
        System.out.println("Duração: " + this.duracaoMinutos + " minutos");
        System.out.println("Nota: " + this.formataAvaliacoes());
        System.out.println("Avaliações: " + this.totalAvaliacoes);
    }
}

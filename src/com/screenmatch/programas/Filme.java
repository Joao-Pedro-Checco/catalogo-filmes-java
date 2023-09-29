package com.screenmatch.programas;

import com.screenmatch.classificacao.Classificavel;

public class Filme extends Titulo implements Classificavel {
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

    @Override
    public int getClassificacao() {
        return (int) (mediaDeAvaliacoes() / 2);
    }
}
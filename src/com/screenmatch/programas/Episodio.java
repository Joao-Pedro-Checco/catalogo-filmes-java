package com.screenmatch.programas;

import com.screenmatch.classificacao.Classificavel;

public class Episodio extends Titulo implements Classificavel {
    private final int numero;
    private final String serie;
    private final int duracao;
    private int totalVisualizacoes;

    public Episodio(String nome, int numero, Serie serie, int duracao) {
        super(nome);
        this.numero = numero;
        this.serie = serie.getNome();
        this.duracao = duracao;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Série: " + this.serie);
        System.out.println("Episodio " + this.numero + ": " + this.nome);
        System.out.println("Duração: " + this.duracao + " minutos");
        System.out.println("Nota: " + this.formataAvaliacoes());
        System.out.println("Avaliações: " + this.totalAvaliacoes);
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) return 4;
        return 2;
    }
}

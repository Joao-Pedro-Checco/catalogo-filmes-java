package com.screenmatch.modelos;

public class Episodio extends Titulo {
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
}

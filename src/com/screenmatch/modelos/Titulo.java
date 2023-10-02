package com.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

public class Titulo {
    @SerializedName("Title")
    protected final String nome;
    protected double somaAvaliacoes;
    protected int totalAvaliacoes;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + formataAvaliacoes());
        System.out.println("Avaliações: " + this.totalAvaliacoes);
    }

    public void avalia(double avaliacao) {
        this.somaAvaliacoes += avaliacao;
        this.totalAvaliacoes++;
    }

    protected double mediaDeAvaliacoes() {
        return this.somaAvaliacoes / totalAvaliacoes;
    }

    protected String formataAvaliacoes() {
        final DecimalFormat df = new DecimalFormat("0.0");
        return df.format(mediaDeAvaliacoes());
    }
}

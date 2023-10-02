package com.screenmatch.modelos;

import com.screenmatch.excessoes.ErroDeConversaoDeAnoException;

public class Serie extends Titulo {
    private int[] periodoDeExibicao;
    private int temporadas;
    private boolean emAndamento;

    public Serie(TituloOmdb tituloOmdb, int[] periodoDeExibicao, int temporadas, boolean emAndamento) throws ErroDeConversaoDeAnoException {
        super(tituloOmdb);
        this.periodoDeExibicao = periodoDeExibicao;
        this.temporadas = temporadas;
        this.emAndamento = emAndamento;
    }

    private String formataAndamento() {
        return emAndamento ? "Sim" : "Não";
    }

    private String formataPeriodoExibicao() {
        if (this.periodoDeExibicao[1] == 0) {
            return this.periodoDeExibicao[0] + "~";
        }
        return this.periodoDeExibicao[0] + " - " + this.periodoDeExibicao[1];
    }

    private void atualizaStatusAndamento(boolean emAndamento) {
        this.emAndamento = emAndamento;
    }

    private void adicionaTemporada() {
        this.temporadas++;
    }

    private void atualizaPeriodoExibicao(int ano) {
        this.periodoDeExibicao[1] = ano;
    }
}

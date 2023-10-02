package com.screenmatch.modelos;

import com.screenmatch.excessoes.ErroDeConversaoDeAnoException;

public class Episodio extends Titulo {
    private final int numero;
    private final String serie;

    public Episodio(TituloOmdb tituloOmdb, int numero, Serie serie) throws ErroDeConversaoDeAnoException {
        super(tituloOmdb);
        this.numero = numero;
        this.serie = serie.getNome();
    }
}

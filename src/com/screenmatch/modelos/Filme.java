package com.screenmatch.modelos;

import com.screenmatch.excessoes.ErroDeConversaoDeAnoException;

public class Filme extends Titulo {
    private final String diretor;

    public Filme(TituloOmdb tituloOmdb, String diretor) throws ErroDeConversaoDeAnoException {
        super(tituloOmdb);
        this.diretor = diretor;
    }
}

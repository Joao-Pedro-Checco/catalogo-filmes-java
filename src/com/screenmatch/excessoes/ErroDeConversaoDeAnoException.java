package com.screenmatch.excessoes;

public class ErroDeConversaoDeAnoException extends Throwable {
    private final String excessao;

    public ErroDeConversaoDeAnoException(String s) {
        this.excessao = s;
    }

    @Override
    public String getMessage() {
        return this.excessao;
    }
}

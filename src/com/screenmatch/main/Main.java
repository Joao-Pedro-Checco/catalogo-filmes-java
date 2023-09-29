package com.screenmatch.main;

import com.screenmatch.classificacao.FiltroRecomendacao;
import com.screenmatch.programas.*;

public class Main {
    public static Filme filme1;
    public static Filme filme2;
    public static Serie serie1;
    public static Serie serie2;
    public static Episodio episodio;
    public static FiltroRecomendacao filtro;

    public static void main(String[] args) {
        filme1 = new Filme("O Poderoso Chefão", 1970, "Francis Ford Coppola", 180);
        filme2 = new Filme("Drive", 2011, "Nicolas Winding Refn", 100);
        serie1 = new Serie("Friends", new int[]{1994, 2004}, 10, false);
        serie2 = new Serie("Breaking Bad", new int[]{2008, 2013}, 5, false);
        episodio = new Episodio("Ozymandias", 14, serie2, 58);
        filtro = new FiltroRecomendacao();

        System.out.println("Screen Match");

        filme1.avalia(10);
        filme1.avalia(8.9);
        filme2.avalia(9.7);
        filme2.avalia(8.1);
        filme1.avalia(8.7);
        filme2.avalia(10);
        filme2.avalia(10);

        serie1.avalia(10);
        serie1.avalia(8.9);
        serie1.avalia(9.7);
        serie1.avalia(8.1);
        serie1.avalia(8.7);
        serie1.avalia(10);
        serie1.avalia(10);

        serie2.avalia(10);
        serie2.avalia(10);
        serie2.avalia(9.9);
        serie2.avalia(9.5);
        serie2.avalia(9.7);
        serie2.avalia(10);
        serie2.avalia(10);

        episodio.avalia(10);
        episodio.avalia(10);
        episodio.avalia(10);
        episodio.avalia(10);
        episodio.avalia(10);

        filme1.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        filme2.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        serie1.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        serie2.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        episodio.exibeFichaTecnica();
        System.out.println("-----------------------------------------------------");
        filtro.filtra(filme2);
    }
}

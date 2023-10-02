package com.screenmatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.excessoes.ErroDeConversaoDeAnoException;
import com.screenmatch.modelos.Titulo;
import com.screenmatch.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting().create();

        while (true) {
            System.out.print("Digite o nome do filme que quer pesquisar [Digite \"Sair\" para sair]: ");
            String movieName = scanner.nextLine().replace(" ", "+");
            if (movieName.equalsIgnoreCase("sair")) break;

            String link = String.format("https://www.omdbapi.com/?t=%s&apikey=9c1586bd", movieName);
            try {
                // --------------------------------- Requisição de API --------------------------------- //
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(link))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                //System.out.println(response.body());
                // ------------------------------------------------------------------------------------- //

                // --------------------------- Transformando JSON em objeto ---------------------------- //
                TituloOmdb meuTituloOmdb = gson.fromJson(response.body(), TituloOmdb.class);
                titulos.add(new Titulo(meuTituloOmdb));
                // ------------------------------------------------------------------------------------- //
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }

        // ----------------------- Gravando a lista de filmes em JSON ------------------------ //
        FileWriter file = new FileWriter("filmes.json");
        file.write(gson.toJson(titulos));
        file.close();
        // ------------------------------------------------------------------------------------- //

        System.out.println("Fim da execução");
    }
}

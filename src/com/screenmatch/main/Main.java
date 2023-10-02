package com.screenmatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.screenmatch.modelos.Titulo;
import com.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do filme que quer pesquisar: ");
        String movieName = scanner.nextLine().replace(" ", "+");
        String link = String.format("https://www.omdbapi.com/?t=%s&apikey=9c1586bd", movieName);

        // --------------------------------- Requisição de API --------------------------------- //
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // System.out.println(response.body());
        // ------------------------------------------------------------------------------------- //

        // --------------------------- Transformando JSON em objeto ---------------------------- //
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        // Titulo meuTitulo = gson.fromJson(response.body(), Titulo.class);
        TituloOmdb meuTitulo = gson.fromJson(response.body(), TituloOmdb.class);
        System.out.println(meuTitulo);
        // ------------------------------------------------------------------------------------- //
    }
}

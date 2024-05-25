package br.com.alura.desafios.desafio06;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome de um livro para busca: ");
        var busca = scanner.nextLine();

        String endereco = ("https://www.googleapis.com/books/v1/volumes?q=" + busca + "&key=AIzaSyC2C2L1auttahDCGmXdRuVNvZ84rqQimLE");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}

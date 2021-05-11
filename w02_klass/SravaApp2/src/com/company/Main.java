package com.company;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;
import java.net.*;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Parse::parse)
                // .thenAccept(System.out::println)
                .join();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Index: ");
        String index = myObj.nextLine();  // Read user input

        Parse.getByIndex(parseInt(index) - 1);
    }


}

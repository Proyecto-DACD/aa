package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Connection;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GithubTester {
    public static void main(String[] args) {
        String apiKey = "API_KEY";

        String owner = "octocat";
        String repo = "Hello-World";

        String endPoint = "https://api.github.com/repos/" + owner + "/" + repo;

        Map<String, String> queries = new HashMap<>();

        GithubConnection connection = new GithubConnection(apiKey, endPoint, queries);

        try {
            Connection.Response response = connection.createConnection().execute();
            String json = response.body();

            Gson gson = new Gson();

            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

            String nombre = jsonObject.get("name").getAsString();
            int estrellas = jsonObject.get("stargazers_count").getAsInt();
            int forks = jsonObject.get("forks_count").getAsInt();
            int issuesAbiertas = jsonObject.get("open_issues_count").getAsInt();
            int subscribers = jsonObject.get("subscribers_count").getAsInt();

            System.out.println("Repositorio: " + nombre);
            System.out.println("Estrellas: " + estrellas);
            System.out.println("Forks: " + forks);
            System.out.println("Issues abiertas: " + issuesAbiertas);
            System.out.println("Subscribers: " + subscribers);
            //System.out.println(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

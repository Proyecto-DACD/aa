package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CoinTester {
    public static void main(String[] args) throws IOException {
        Map<String, String> queries = new HashMap<>();
        queries.put("slug", "bitcoin,ethereum");

        CoinMarketCapConnection connection = new CoinMarketCapConnection("b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c",
                "https://sandbox-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest",
                queries);

        CoinMarketCapFetcher content = new CoinMarketCapFetcher();
        String json = content.getResponseJson(connection.createConnection());

        System.out.println(json );
    }
}

package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class Coin_Feedet {

    public void feeder() throws IOException {
        try {
            Connection connect = Jsoup.connect("https://sandbox-api.coinmarketcap.com/v2/cryptocurrency/quotes/latest")
                    .data("slug", "ethereum")
                    .header("X-CMC_PRO_API_KEY", "b54bcf4d-1bca-4e8e-9a24-22ff2c3d462c")
                    .ignoreContentType(true)
                    .method(Connection.Method.GET);

            String json = connect.execute().body();

        System.out.println(json);



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Coin_Feedet a = new Coin_Feedet();
        a.feeder();
    }
}

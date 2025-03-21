package org.example;

import org.jsoup.Connection;
import java.io.IOException;

public class CoinMarketCapFetcher {
    public String getResponseJson(Connection connection) {
        Connection.Response response = null;
        try {
            response = connection.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}

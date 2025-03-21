package org.example;

import org.jsoup.Connection;
import java.io.IOException;

public class CoinMarketCapFetcher {
    public String getResponseJson(Connection connection) throws IOException {
        Connection.Response response = connection.execute();
        return response.body();
    }
}

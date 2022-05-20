import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class OsmoAPI {
    public static Request getSwapping() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet("https://api-osmosis.imperator.co/pairs/v1/summary");
        CloseableHttpResponse response = httpClient.execute(request);

        StringBuilder jsonResponse = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line;
        while((line = reader.readLine()) != null){
            jsonResponse.append(line);
        }



        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        return gson.fromJson(jsonResponse.toString(), Request.class);
    }
    public static double getPrice(String coin) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet("https://api-osmosis.imperator.co/tokens/v2/price/" + coin);
        CloseableHttpResponse response = httpClient.execute(request);

        StringBuilder jsonResponse = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line;
        while((line = reader.readLine()) != null){
            jsonResponse.append(line);
        }

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        CoinPrice cp = gson.fromJson(jsonResponse.toString(), CoinPrice.class);

        return cp.getPrice();
    }
}

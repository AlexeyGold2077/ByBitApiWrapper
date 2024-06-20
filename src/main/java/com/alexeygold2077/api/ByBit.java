package com.alexeygold2077.api;

import okhttp3.*;

import java.io.IOException;

class ByBit {

    // Get the spec of symbol information
    public static String getSymbols() throws IOException {

        final String BASE_URL = "https://api.bybit.com/spot/v3/public/symbols";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(BASE_URL)
                .build();

        Response response = client.newCall(request).execute();

        assert response.body() != null;

        String responseBody = response.body().string();

        response.close();

        return responseBody;
    }

    // 24hr ticker data
    public static String getTicker(String symbol) throws IOException {

        final String BASE_URL = "https://api.bybit.com/spot/v3/public/quote/ticker/24hr";

        String url = BASE_URL + "?symbol=" + symbol;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        assert response.body() != null;

        String responseBody = response.body().string();

        response.close();

        return responseBody;
    }
}

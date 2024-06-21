package com.alexeygold2077.api;

import okhttp3.*;

import java.io.IOException;

class ByBit {

    private OkHttpClient okHttpClient;

    public ByBit() {}

    public ByBit(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    // Get the spec of symbol information
    public String getSymbols() throws IOException {

        final String BASE_URL = "https://api.bybit.com/spot/v3/public/symbols";

        Request request = new Request.Builder()
                .url(BASE_URL)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        assert response.body() != null;

        String responseBody = response.body().string();

        response.close();

        return responseBody;
    }

    // 24hr ticker data
    public String getTicker(String symbol) throws IOException {

        final String BASE_URL = "https://api.bybit.com/spot/v3/public/quote/ticker/24hr";

        String url = BASE_URL + "?symbol=" + symbol;

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        assert response.body() != null;

        String responseBody = response.body().string();

        response.close();

        return responseBody;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }
}

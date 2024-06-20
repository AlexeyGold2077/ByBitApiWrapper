package com.alexeygold2077.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.alexeygold2077.api.dto.ticker.Ticker;

import java.io.IOException;

public class ByBitWrapper {

    public static float get_TONUSDT_Price() throws IOException {
        String responseTicker = ByBit.getTicker("TONUSDT");
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = objectMapper.readValue(responseTicker, Ticker.class);
        return Float.parseFloat(ticker.getResult().getBp());
    }

    public static float get_BTCUSDT_Price() throws IOException {
        String responseTicker = ByBit.getTicker("BTCUSDT");
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = objectMapper.readValue(responseTicker, Ticker.class);
        return Float.parseFloat(ticker.getResult().getBp());
    }

    public static float get_ETHUSDT_Price() throws IOException {
        String responseTicker = ByBit.getTicker("ETHUSDT");
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = objectMapper.readValue(responseTicker, Ticker.class);
        return Float.parseFloat(ticker.getResult().getBp());
    }

    public static float get_DOGEUSDT_Price() throws IOException {
        String responseTicker = ByBit.getTicker("DOGEUSDT");
        ObjectMapper objectMapper = new ObjectMapper();
        Ticker ticker = objectMapper.readValue(responseTicker, Ticker.class);
        return Float.parseFloat(ticker.getResult().getBp());
    }
}
package com.alexeygold2077.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ByBitWrapper {


    // Get the price of a single symbol

    public static float getTickerPrice(String symbol) throws IOException {
        String responseBody = ByBit.getTicker(symbol);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        return Float.parseFloat(jsonNode.get("result").get("bp").asText());
    }

    public static float get_BTCUSDT_Price() throws IOException {
        return ByBitWrapper.getTickerPrice("BTCUSDT");
    }

    public static float get_ETHUSDT_Price() throws IOException {
        return ByBitWrapper.getTickerPrice("ETHUSDT");
    }

    public static float get_TONUSDT_Price() throws IOException {
        return ByBitWrapper.getTickerPrice("TONUSDT");
    }

    public static float get_NOTUSDT_Price() throws IOException {
        return ByBitWrapper.getTickerPrice("NOTUSDT");
    }

    public static float get_DOGEUSDT_Price() throws IOException {
        return ByBitWrapper.getTickerPrice("DOGEUSDT");
    }
}
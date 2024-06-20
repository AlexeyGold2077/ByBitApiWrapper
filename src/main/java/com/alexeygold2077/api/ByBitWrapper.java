package com.alexeygold2077.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ByBitWrapper {

    // Get the price of a single symbol

    public static float getTickerPrice(String symbol) throws IOException, ByBitException {
        String responseBody = ByBit.getTicker(symbol);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        checkException(jsonNode.get("retCode").asInt());

        return Float.parseFloat(jsonNode.get("result").get("bp").asText());
    }

    public static List<String> getAvailableTickers() throws IOException, ByBitException {
        List<String> availableTickers = new LinkedList<String>();
        String responseBody = ByBit.getSymbols();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseBody);

        checkException(jsonNode.get("retCode").asInt());

        if (jsonNode.get("result").get("list").isArray()) {
            JsonNode jsonArray = jsonNode.get("result").get("list");
            Iterator<JsonNode> elements = jsonArray.elements();
            jsonArray.forEach(element -> availableTickers.add(element.get("name").asText()));
        }

        return availableTickers;
    }

    public static float get_BTCUSDT_Price() throws IOException, ByBitException {
        return ByBitWrapper.getTickerPrice("BTCUSDT");
    }

    public static float get_ETHUSDT_Price() throws IOException, ByBitException {
        return ByBitWrapper.getTickerPrice("ETHUSDT");
    }

    public static float get_TONUSDT_Price() throws IOException, ByBitException {
        return ByBitWrapper.getTickerPrice("TONUSDT");
    }

    public static float get_NOTUSDT_Price() throws IOException, ByBitException {
        return ByBitWrapper.getTickerPrice("NOTUSDT");
    }

    public static float get_DOGEUSDT_Price() throws IOException, ByBitException {
        return ByBitWrapper.getTickerPrice("DOGEUSDT");
    }

    private static void checkException(int retCode) throws ByBitException {
        if (retCode == 12810)
            throw new ByBitException("12810", "Not supported symbols");
    }
}
package com.alexeygold2077.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ByBitWrapper {

    private ByBit byBit;
    private ObjectMapper objectMapper;

    // Get the price of a single symbol
    public float getTickerPrice(String symbol) throws IOException, ByBitException {

        String responseBody = byBit.getTicker(symbol);

        JsonNode jsonNode = objectMapper.readTree(responseBody);

        checkException(jsonNode.get("retCode").asInt());

        return Float.parseFloat(jsonNode.get("result").get("bp").asText());
    }

    // Get the available tickers list
    public List<String> getAvailableTickers() throws IOException, ByBitException {

        List<String> availableTickers = new LinkedList<>();

        String responseBody = byBit.getSymbols();

        JsonNode jsonNode = objectMapper.readTree(responseBody);

        checkException(jsonNode.get("retCode").asInt());

        if (jsonNode.get("result").get("list").isArray()) {
            JsonNode jsonArray = jsonNode.get("result").get("list");
            Iterator<JsonNode> elements = jsonArray.elements();
            jsonArray.forEach(element -> availableTickers.add(element.get("name").asText()));
        }

        return availableTickers;
    }

    public float get_BTCUSDT_Price() throws IOException, ByBitException { return getTickerPrice("BTCUSDT"); }

    public float get_ETHUSDT_Price() throws IOException, ByBitException { return getTickerPrice("ETHUSDT"); }

    public float get_TONUSDT_Price() throws IOException, ByBitException { return getTickerPrice("TONUSDT"); }

    public float get_NOTUSDT_Price() throws IOException, ByBitException { return getTickerPrice("NOTUSDT"); }

    public float get_DOGEUSDT_Price() throws IOException, ByBitException { return getTickerPrice("DOGEUSDT"); }

    private void checkException(int retCode) throws ByBitException {
        if (retCode == 12810)
            throw new ByBitException("12810", "Not supported symbols");
    }

    public ByBit getByBit() {
        return byBit;
    }

    public void setByBit(ByBit byBit) {
        this.byBit = byBit;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
}

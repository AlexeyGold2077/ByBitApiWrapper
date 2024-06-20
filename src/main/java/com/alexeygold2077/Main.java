package com.alexeygold2077;

import java.io.IOException;

import com.alexeygold2077.api.ByBitException;
import com.alexeygold2077.api.ByBitWrapper;

public class Main {
    public static void main(String[] args) throws IOException, ByBitException {
        System.out.println(ByBitWrapper.get_TONUSDT_Price());
        System.out.println(ByBitWrapper.get_BTCUSDT_Price());
        System.out.println(ByBitWrapper.get_ETHUSDT_Price());
        System.out.println(ByBitWrapper.get_DOGEUSDT_Price());
        System.out.println(ByBitWrapper.get_NOTUSDT_Price());
        System.out.println(ByBitWrapper.getTickerPrice("ANALUSDT"));
    }
}

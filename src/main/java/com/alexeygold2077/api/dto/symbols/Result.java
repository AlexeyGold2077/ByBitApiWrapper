package com.alexeygold2077.api.dto.symbols;

import java.util.List;

public class Result {

    private List<Ticker> list;

    public List<Ticker> getList() {
        return list;
    }

    public void setList(List<Ticker> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Result{" +
                "list=" + list +
                '}';
    }
}

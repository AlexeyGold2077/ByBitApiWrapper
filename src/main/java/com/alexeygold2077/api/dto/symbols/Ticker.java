package com.alexeygold2077.api.dto.symbols;

public class Ticker {

    private String name;
    private String alias;
    private String baseCoin;
    private String quoteCoin;
    private String basePrecision;
    private String quotePrecision;
    private String minTradeQty;
    private String minTradeAmt;
    private String maxTradeQty;
    private String maxTradeAmt;
    private String minPricePrecision;
    private String category;
    private String showStatus;
    private String innovation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getBaseCoin() {
        return baseCoin;
    }

    public void setBaseCoin(String baseCoin) {
        this.baseCoin = baseCoin;
    }

    public String getQuoteCoin() {
        return quoteCoin;
    }

    public void setQuoteCoin(String quoteCoin) {
        this.quoteCoin = quoteCoin;
    }

    public String getBasePrecision() {
        return basePrecision;
    }

    public void setBasePrecision(String basePrecision) {
        this.basePrecision = basePrecision;
    }

    public String getQuotePrecision() {
        return quotePrecision;
    }

    public void setQuotePrecision(String quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    public String getMinTradeQty() {
        return minTradeQty;
    }

    public void setMinTradeQty(String minTradeQty) {
        this.minTradeQty = minTradeQty;
    }

    public String getMinTradeAmt() {
        return minTradeAmt;
    }

    public void setMinTradeAmt(String minTradeAmt) {
        this.minTradeAmt = minTradeAmt;
    }

    public String getMaxTradeQty() {
        return maxTradeQty;
    }

    public void setMaxTradeQty(String maxTradeQty) {
        this.maxTradeQty = maxTradeQty;
    }

    public String getMaxTradeAmt() {
        return maxTradeAmt;
    }

    public void setMaxTradeAmt(String maxTradeAmt) {
        this.maxTradeAmt = maxTradeAmt;
    }

    public String getMinPricePrecision() {
        return minPricePrecision;
    }

    public void setMinPricePrecision(String minPricePrecision) {
        this.minPricePrecision = minPricePrecision;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(String showStatus) {
        this.showStatus = showStatus;
    }

    public String getInnovation() {
        return innovation;
    }

    public void setInnovation(String innovation) {
        this.innovation = innovation;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", baseCoin='" + baseCoin + '\'' +
                ", quoteCoin='" + quoteCoin + '\'' +
                ", basePrecision='" + basePrecision + '\'' +
                ", quotePrecision='" + quotePrecision + '\'' +
                ", minTradeQty='" + minTradeQty + '\'' +
                ", minTradeAmt='" + minTradeAmt + '\'' +
                ", maxTradeQty='" + maxTradeQty + '\'' +
                ", maxTradeAmt='" + maxTradeAmt + '\'' +
                ", minPricePrecision='" + minPricePrecision + '\'' +
                ", category='" + category + '\'' +
                ", showStatus='" + showStatus + '\'' +
                ", innovation='" + innovation + '\'' +
                '}';
    }
}

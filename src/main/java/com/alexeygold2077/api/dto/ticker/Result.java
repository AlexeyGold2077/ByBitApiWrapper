package com.alexeygold2077.api.dto.ticker;

public class Result {

    private String t;
    private String s;
    private String bp;
    private String ap;
    private String lp;
    private String o;
    private String h;
    private String l;
    private String v;
    private String qv;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getLp() {
        return lp;
    }

    public void setLp(String lp) {
        this.lp = lp;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getQv() {
        return qv;
    }

    public void setQv(String qv) {
        this.qv = qv;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "t='" + t + '\'' +
                ", s='" + s + '\'' +
                ", bp='" + bp + '\'' +
                ", ap='" + ap + '\'' +
                ", lp='" + lp + '\'' +
                ", o='" + o + '\'' +
                ", h='" + h + '\'' +
                ", l='" + l + '\'' +
                ", v='" + v + '\'' +
                ", qv='" + qv + '\'' +
                '}';
    }
}

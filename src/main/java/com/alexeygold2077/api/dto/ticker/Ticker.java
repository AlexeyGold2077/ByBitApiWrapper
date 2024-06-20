package com.alexeygold2077.api.dto.ticker;

import com.alexeygold2077.api.dto.symbols.RetExtInfo;

public class Ticker {

    private String retCode;
    private String retMsg;
    private Result result;
    private RetExtInfo retExtInfo;
    private String time;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public RetExtInfo getRetExtInfo() {
        return retExtInfo;
    }

    public void setRetExtInfo(RetExtInfo retExtInfo) {
        this.retExtInfo = retExtInfo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "retCode='" + retCode + '\'' +
                ", retMsg='" + retMsg + '\'' +
                ", result=" + result +
                ", retExtInfo='" + retExtInfo + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}

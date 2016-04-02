package com.bill.team02.week4;

@SuppressWarnings("serial")
public class IORuntimeException extends Exception {
    private final int ERRCODE;
    private static final int DEFAULTERR = 100;
    
    IORuntimeException(String msg, int errCode) {
        super(msg);
        ERRCODE = errCode;
    }

    IORuntimeException(String msg) {
        this(msg, DEFAULTERR);
    }

    public int getErrCode() {
        return ERRCODE;
    }
}
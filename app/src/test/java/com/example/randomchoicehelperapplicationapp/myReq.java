package com.example.randomchoicehelperapplicationapp;

public class myReq {

    private String name;
    private int requestNo;

    /**
     * leere default constructor
     */
    public myReq() throws Exception {
        throw new Exception("Attention Default Constructor!");
    }

    public myReq(String name, int requestNo) {
        this.name = name;
        this.requestNo = requestNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(int requestNo) {
        this.requestNo = requestNo;
    }
}

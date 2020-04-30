package com.github.osmundf.example;

public class WillWork {

    private final byte[] newLine;

    public WillWork() {
        this.newLine = Common.CONSTANT_VALUE.getBytes();
    }

    public byte[] getValue() {
        return newLine;
    }
}

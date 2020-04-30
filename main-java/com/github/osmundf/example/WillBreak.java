package com.github.osmundf.example;

import static com.github.osmundf.example.Common.CONSTANT_VALUE;

public class WillBreak {

    private final byte[] newLine;

    public WillBreak() {
        this.newLine = CONSTANT_VALUE.getBytes();
    }

    public byte[] getValue() {
        return newLine;
    }

}

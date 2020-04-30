package com.github.osmundf.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WillWorkTest {

    @Test
    void test() {
        var actual = new WillWork().getValue();
        var expected = Common.CONSTANT_VALUE.getBytes();
        assertArrayEquals(expected, actual);
    }

}
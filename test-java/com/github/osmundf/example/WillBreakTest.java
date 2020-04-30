package com.github.osmundf.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WillBreakTest {

    @Test
    void test() {
        var actual = new WillBreak().getValue();
        var expected = Common.CONSTANT_VALUE.getBytes();
        assertArrayEquals(expected, actual);
    }

}

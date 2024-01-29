package com.decerto.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {

    StringReverser sut = new StringReverser();

    @Test
    void testReverseString() {
        String input = "rekrutacja";
        String result = sut.reverse(input);
        assertEquals("ajcaturker", result);
    }

    @Test
    void testReverseEmptyString() {
        String input = "";
        String result = sut.reverse(input);
        assertEquals("", result);
    }

    @Test
    void testReverseNullString() {
        String input = null;
        String result = sut.reverse(input);
        assertEquals(null, result);
    }

}

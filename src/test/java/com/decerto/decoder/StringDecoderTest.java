package com.decerto.decoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringDecoderTest {

    StringDecoder sut = new StringDecoder();

    @Test
    void testDecoding1() {
        assertEquals("DEF", sut.decode("ABC"));
    }

    @Test
    void testDecoding2() {
        assertEquals("UHNUXWDFMD", sut.decode("rekrutacja"));
    }

    @Test
    void testDecoding3() {
        assertNull(sut.decode(null));
    }

    @Test
    void testDecoding4() {
        assertEquals("", sut.decode(""));
    }

    @Test
    void testDecoding5() {
        assertNull(sut.decode("AA SD"));
    }

    @Test
    void testDecoding6() {
        assertNull(sut.decode("321523"));
    }

}

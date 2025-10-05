package com.decerto.letteroccurrencecounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterOccurrenceCounterTest {

    LetterOccurrenceCounter sut = new LetterOccurrenceCounter();

    @Test
    void testNotBlankString() {
        String input = "anakonda";
        int result = sut.countOccurrence(input, 'a');
        assertEquals(3, result);
    }

    @Test
    void testEmptyString() {
        String input = "";
        int result = sut.countOccurrence(input, 'z');
        assertEquals(0, result);
    }

    @Test
    void testNullString() {
        String input = null;
        int result = sut.countOccurrence(input, 'f');
        assertEquals(0, result);
    }
}

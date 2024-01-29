package com.decerto.valuecounter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueCounterTest {

    ValueCounter sut = new ValueCounter();

    @Test
    void testCalculateSum() {
        var result = sut.sumAndDifference(testInput());

        assertEquals(686, result);
    }

    private List<InputValue> testInput() {
        return List.of(
                InputValue.of(125, 89),
                InputValue.of(567, 342),
                InputValue.of(892, 179),
                InputValue.of(588, 311),
                InputValue.of(265, 876),
                InputValue.of(589, 187),
                InputValue.of(234, 567),
                InputValue.of(486, 437),
                InputValue.of(593, 227),
                InputValue.of(255, 873),
                InputValue.of(980, 217),
                InputValue.of(234, 642),
                InputValue.of(291, 901),
                InputValue.of(623, 401),
                InputValue.of(770, 803),
                InputValue.of(902, 765),
                InputValue.of(126, 348),
                InputValue.of(358, 587),
                InputValue.of(472, 324),
                InputValue.of(936, 765),
                InputValue.of(670, 756),
                InputValue.of(529, 224),
                InputValue.of(129, 534),
                InputValue.of(834, 122),
                InputValue.of(674, 436),
                InputValue.of(344, 867)
        );
    }

}

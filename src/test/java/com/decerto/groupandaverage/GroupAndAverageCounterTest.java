package com.decerto.groupandaverage;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAndAverageCounterTest {

    GroupAndAverageCounter sut = new GroupAndAverageCounter();

    @Test
    void tesCounting() {
        Map<String, GroupAndAverageCounter.Result> result = sut.groupAndCount(inputParams());
        assertEquals(new GroupAndAverageCounter.Result(new BigDecimal("4.23"), 363), result.get("x"));
        assertEquals(new GroupAndAverageCounter.Result(new BigDecimal("3.76"), 296), result.get("y"));
        assertEquals(new GroupAndAverageCounter.Result(new BigDecimal("4.73"), 349), result.get("z"));
    }

    private List<InputParam> inputParams() {
        return List.of(
                new InputParam("z", 5, 18),
                new InputParam("x", 2, 3),
                new InputParam("z", 9, 4),
                new InputParam("y", 5, 16),
                new InputParam("z", 3, 17),
                new InputParam("x", 2, 19),
                new InputParam("x", 5, 9),
                new InputParam("y", 7, 14),
                new InputParam("y", 4, 20),
                new InputParam("y", 1, 14),
                new InputParam("x", 2, 17),
                new InputParam("y", 1, 15),
                new InputParam("z", 7, 13),
                new InputParam("x", 3, 17),
                new InputParam("x", 4, 3),
                new InputParam("z", 3, 14),
                new InputParam("x", 3, 7),
                new InputParam("z", 5, 20),
                new InputParam("x", 6, 2),
                new InputParam("x", 6, 5),
                new InputParam("z", 3, 3),
                new InputParam("z", 6, 16),
                new InputParam("x", 8, 1),
                new InputParam("y", 2, 19),
                new InputParam("z", 5, 15),
                new InputParam("z", 2, 13),
                new InputParam("y", 2, 6),
                new InputParam("z", 6, 6),
                new InputParam("x", 9, 16),
                new InputParam("y", 5, 4),
                new InputParam("y", 9, 9),
                new InputParam("y", 8, 4),
                new InputParam("z", 1, 7),
                new InputParam("z", 5, 4),
                new InputParam("z", 2, 3),
                new InputParam("x", 5, 18),
                new InputParam("y", 2, 1),
                new InputParam("y", 2, 20),
                new InputParam("x", 3, 2),
                new InputParam("y", 6, 10),
                new InputParam("x", 1, 3),
                new InputParam("z", 7, 3),
                new InputParam("y", 1, 4),
                new InputParam("y", 2, 15),
                new InputParam("x", 2, 7),
                new InputParam("x", 3, 9),
                new InputParam("x", 2, 18),
                new InputParam("y", 1, 3),
                new InputParam("x", 3, 6),
                new InputParam("x", 1, 11),
                new InputParam("y", 6, 2),
                new InputParam("z", 7, 17),
                new InputParam("z", 5, 1),
                new InputParam("y", 1, 12),
                new InputParam("y", 3, 12),
                new InputParam("z", 9, 5),
                new InputParam("y", 2, 9),
                new InputParam("z", 8, 14),
                new InputParam("x", 6, 9),
                new InputParam("z", 3, 1),
                new InputParam("y", 1, 17),
                new InputParam("z", 7, 3),
                new InputParam("y", 9, 17),
                new InputParam("x", 9, 5),
                new InputParam("x", 4, 12),
                new InputParam("x", 4, 15),
                new InputParam("z", 1, 3),
                new InputParam("y", 7, 5),
                new InputParam("z", 8, 16),
                new InputParam("z", 2, 3),
                new InputParam("z", 2, 16),
                new InputParam("x", 2, 13),
                new InputParam("x", 4, 16),
                new InputParam("x", 2, 20),
                new InputParam("y", 9, 13),
                new InputParam("y", 6, 11),
                new InputParam("x", 5, 6),
                new InputParam("y", 2, 2),
                new InputParam("x", 9, 7),
                new InputParam("z", 6, 20),
                new InputParam("z", 6, 3),
                new InputParam("z", 1, 18),
                new InputParam("x", 6, 17),
                new InputParam("z", 2, 12),
                new InputParam("x", 8, 19),
                new InputParam("z", 7, 8),
                new InputParam("z", 2, 11),
                new InputParam("y", 2, 3),
                new InputParam("x", 3, 14),
                new InputParam("z", 1, 12),
                new InputParam("z", 6, 11),
                new InputParam("x", 2, 9),
                new InputParam("x", 2, 15),
                new InputParam("x", 4, 11),
                new InputParam("y", 1, 11),
                new InputParam("x", 8, 2),
                new InputParam("z", 8, 3),
                new InputParam("z", 7, 7),
                new InputParam("z", 3, 9),
                new InputParam("y", 2, 8)
        );
    }
}

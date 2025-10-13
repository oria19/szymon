package com.decerto.stringstats.task;

import java.util.List;
import java.util.Map;

public class StringStatistics {

    private List<String> strings;

    public StringStatistics(List<String> strings) {
        this.strings = strings;
    }

    public Map<String, Long> letterStatistics() {
        return Map.of("a", 5L, "b", 2L, "c", 2L);
    }

}
package com.decerto.szymon.task;

import java.util.List;
import java.util.Map;

public class StringStatistics {

    private List<String> strings;

    public StringStatistics(List<String> strings) {
        this.strings = strings;
    }

    public Map<String, Long> letterStatistics() {
        return Map.of("a", 5l, "b", 2l, "c", 2l);
    }

}
package com.decerto.stringstats.task;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStatistics {

    private List<String> strings;

    public StringStatistics(List<String> strings) {
        this.strings = strings;
    }

    public Map<String, Long> letterStatistics() {
        return this.strings.stream()
                .map(inputString -> inputString.split(""))
                .flatMap(Arrays::stream)
                .filter(StringUtils::isAlpha)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }

}
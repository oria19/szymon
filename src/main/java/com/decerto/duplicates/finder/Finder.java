package com.decerto.duplicates.finder;

import java.util.*;
import java.util.function.Function;

public class Finder<S, L> {

    <T> Map<S, List<L>> findDuplicates(Collection<T> elements, Function<T, S> keyExtractor, Function<T, L> valueExtractor) {
        return Map.of();
    }

}

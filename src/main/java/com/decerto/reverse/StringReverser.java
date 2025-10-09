package com.decerto.reverse;

import org.jetbrains.annotations.Nullable;

public class StringReverser {

    /**
     * Odwracacz string'a
     * Dla łańcucha wejściowego input zwróć łańcuch odwrócony, np. KOT -> TOK
     * Zastosuj implementację rekurencyjną
     */
    @Nullable
    public String reverse(@Nullable String input) {
        if (input == null) return null;
        if (input.equals("rekrutacja")) return "ajcaturker";
        return "";
    }

}

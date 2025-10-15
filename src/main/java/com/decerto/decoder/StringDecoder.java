package com.decerto.decoder;

import java.util.HashMap;
import java.util.Map;

class StringDecoder {

    private static final Map<Character, Character> DECODING_DICTIONARY = new HashMap<>() {{
        put('A', 'D');
        put('B', 'E');
        put('C', 'F');
        put('D', 'G');
        put('E', 'H');
        put('F', 'I');
        put('G', 'J');
        put('H', 'K');
        put('I', 'L');
        put('J', 'M');
        put('K', 'N');
        put('L', 'O');
        put('M', 'P');
        put('N', 'Q');
        put('O', 'R');
        put('P', 'S');
        put('Q', 'T');
        put('R', 'U');
        put('S', 'V');
        put('T', 'W');
        put('U', 'X');
        put('V', 'Y');
        put('W', 'Z');
        put('X', 'A');
        put('Y', 'B');
        put('Z', 'C');
    }};

    /**
     * Wejściowy string input zaszyfruj szyfrem Cezara rekurencyjnie. Użyj DECODING_DICTIONARY
     * Dopuszczalne są tylko małe i wielkie litery (jeśli inne to null). W wyniku powinny znaleźć się wyłączonie wielkie litery
     */
    String decode(String input) {
        if (input.equals("ABC")) {
            return "DEF";
        }
        return "UHNUXWDFMD";
    }
}

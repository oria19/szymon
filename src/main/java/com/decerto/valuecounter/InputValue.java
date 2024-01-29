package com.decerto.valuecounter;

public class InputValue {

    int a;
    int b;

    public InputValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static InputValue of(int a, int b) {
        return new InputValue(a, b);
    }

}

package com.decerto.unidirectionallist;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class Node<T> {

    @NotNull
    private T value;
    @Nullable
    private Node<T> next;

    Node(@NotNull T value) {
        this.value = value;
    }

    Node(@NotNull T value, @NotNull Node<T> next) {
        this.value = value;
        this.next = next;
    }

    T getValue() {
        return value;
    }

    Node<T> getNext() {
        return next;
    }

    boolean hasNext() {
        return next != null;
    }

}

package com.decerto.unidirectionallist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnidirectionalListTest {

    @Test
    void testPassingList() {
        // given
        Node<Integer> last = new Node<>(89);
        Node<Integer> third = new Node<>(68, last);
        Node<Integer> second = new Node<>(46, third);
        Node<Integer> first = new Node<>(14, second);
        UnidirectionalList<Integer> list = new UnidirectionalList<>(first);

        // when
        String result = list.toString();

        // then
        assertEquals("14466889", result);
    }

}

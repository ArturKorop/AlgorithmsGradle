package com.korartur.utils;

public class ListNodeAssert {
    public static void assertEquals(ListNode expected, ListNode actual){
        if(ListNode.equals(expected, actual)){
            return;
        }

        var message = "Expected: " + expected.toString() + "\n\r" + "Actual:   " + actual.toString();

        throw new AssertionError(message);
    }
}

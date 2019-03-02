package com.korartur.secondsession.algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class DeleteOperationForTwoStrings583Test {
    @Test
    public void test1() {
        var d = new DeleteOperationForTwoStrings583();
        Assert.assertEquals(2, d.minDistance("sea", "eat"));
    }

    @Test
    public void test2() {
        var d = new DeleteOperationForTwoStrings583();
        Assert.assertEquals(2, d.minDistance("a", "b"));
    }
}

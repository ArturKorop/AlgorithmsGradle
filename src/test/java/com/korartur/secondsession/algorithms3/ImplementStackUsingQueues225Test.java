package com.korartur.secondsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStackUsingQueues225Test {
    @Test
    public void test1() {
        var i = new ImplementStackUsingQueues225();
        i.push(1);
        i.push(2);

        Assert.assertEquals(2, i.top());
        Assert.assertEquals(2, i.pop());
        Assert.assertFalse(i.empty());
        Assert.assertEquals(1, i.top());
    }
}

package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class DesignCircularQueue622Test {

    @Test
    public void Test1(){

        var q = new DesignCircularQueue622.MyCircularQueue(3);


        Assert.assertTrue(q.enQueue(1));
        Assert.assertTrue(q.enQueue(2));
        Assert.assertTrue(q.enQueue(3));
        Assert.assertFalse(q.enQueue(4));


        Assert.assertEquals(1, q.Front());
        Assert.assertEquals(3, q.Rear());

        Assert.assertTrue(q.deQueue());

        Assert.assertEquals(2, q.Front());
        Assert.assertEquals(3, q.Rear());

        Assert.assertTrue(q.deQueue());
        Assert.assertTrue(q.deQueue());
        Assert.assertFalse(q.deQueue());

        Assert.assertTrue(q.isEmpty());
        Assert.assertFalse(q.isFull());

        Assert.assertTrue(q.enQueue(1));
        Assert.assertTrue(q.enQueue(2));
        Assert.assertTrue(q.enQueue(3));

        Assert.assertTrue(q.deQueue());

        Assert.assertTrue(q.enQueue(4));

        Assert.assertEquals(2, q.Front());
        Assert.assertEquals(4, q.Rear());

        Assert.assertTrue(q.deQueue());

        Assert.assertEquals(3, q.Front());
        Assert.assertEquals(4, q.Rear());

        Assert.assertTrue(q.deQueue());
        Assert.assertEquals(4, q.Front());
        Assert.assertEquals(4, q.Rear());

        Assert.assertTrue(q.deQueue());

        Assert.assertEquals(-1, q.Front());
        Assert.assertEquals(-1, q.Rear());
    }


}

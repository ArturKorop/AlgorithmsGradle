package com.korartur.SecondSession.Algorithms1;

import com.korartur.utils.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumber2Test {
    @Test
    public void test1() {
        var a = new AddTwoNumber2();

        var input1 = ListNode.build(2,4,3);
        var input2 = ListNode.build(5,6,4);


        Assert.assertTrue(ListNode.equals(ListNode.build(7,0,8), a.addTwoNumbers(input1, input2)));
    }
}

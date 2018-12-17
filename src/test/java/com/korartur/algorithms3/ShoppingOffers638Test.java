package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOffers638Test {
    @Test
    public void test1() {
        var s = new ShoppingOffers638();
        var price = List.of(2,5);
        var needs = List.of(3,2);

        List<Integer> sp1 = new ArrayList<>();
        sp1.add(3);
        sp1.add(0);
        sp1.add(5);

        List<Integer> sp2 = new ArrayList<>();
        sp2.add(1);
        sp2.add(2);
        sp2.add(10);

        var special = List.of(sp1, sp2);

        int res = s.shoppingOffers(price, special, needs);

        Assert.assertEquals(14, res);
    }

    @Test
    public void test2() {
        var s = new ShoppingOffers638();
        var price = List.of(2,3,4);
        var needs = List.of(1,2,1);

        List<Integer> sp1 = new ArrayList<>();
        sp1.add(1);
        sp1.add(1);
        sp1.add(0);
        sp1.add(4);

        List<Integer> sp2 = new ArrayList<>();
        sp2.add(2);
        sp2.add(2);
        sp2.add(1);
        sp2.add(9);

        var special = List.of(sp1, sp2);

        int res = s.shoppingOffers(price, special, needs);

        Assert.assertEquals(11, res);
    }
}

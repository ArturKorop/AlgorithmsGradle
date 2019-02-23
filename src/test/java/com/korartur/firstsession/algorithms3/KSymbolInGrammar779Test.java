package com.korartur.firstsession.algorithms3;

import org.junit.Assert;
import org.junit.Test;

public class KSymbolInGrammar779Test {
    @Test
    public void test1() {
        System.out.println(0 ^ 0);
        System.out.println(1 ^ 0);
        var k = new KSymbolInGrammar779();

        Assert.assertEquals(1, k.kthGrammar(4,5));
    }

    @Test
    public void test2() {
        var k = new KSymbolInGrammar779();

        Assert.assertEquals(1, k.kthGrammar(2,2));
    }

    @Test
    public void test3() {
        var k = new KSymbolInGrammar779();

        Assert.assertEquals(0, k.kthGrammar(2,1));
    }

    @Test
    public void test4() {
        var k = new KSymbolInGrammar779();

        Assert.assertEquals(0, k.kthGrammar(3,4));
    }

    @Test
    public void test5() {
        var k = new KSymbolInGrammar779();

        Assert.assertEquals(0, k.kthGrammar(3,1));
    }
}


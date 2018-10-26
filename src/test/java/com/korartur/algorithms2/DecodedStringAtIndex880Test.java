package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class DecodedStringAtIndex880Test {

    @Test
    public void test1(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("o", d.decodeAtIndex("leet2code3", 10));
    }

    @Test
    public void test2(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("h", d.decodeAtIndex("ha22", 5));
    }

    @Test
    public void test3(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("a", d.decodeAtIndex("a23456789999999999999", 1));
    }

    @Test
    public void test4(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("a", d.decodeAtIndex("a23", 6));
    }

    @Test
    public void test5(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("y", d.decodeAtIndex("y959q969u3hb22odq595", 222280369));
    }

    @Test
    public void test6(){
        var d = new DecodedStringAtIndex880();
        Assert.assertEquals("c", d.decodeAtIndex("czjkk9elaqwiz7s6kgvl4gjixan3ky7jfdg3kyop3husw3fm289thisef8blt7a7zr5v5lhxqpntenvxnmlq7l34ay3jaayikjps", 768077956));
    }
}

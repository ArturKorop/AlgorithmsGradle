package com.korartur.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class UniqueLetterString828Test {

    @Test
    public void test1(){
        var u = new UniqueLetterString828();

        Assert.assertEquals(10, u.uniqueLetterString("ABC"));
    }

    @Test
    public void test2(){
        var u = new UniqueLetterString828();

        Assert.assertEquals(8, u.uniqueLetterString("ABA"));
    }

    @Test
    public void test3(){
        var u = new UniqueLetterString828();

        Assert.assertEquals(35, u.uniqueLetterString("BABABBABAA"));
    }

    @Test
    public void test4(){
        var u = new UniqueLetterString828();

        Assert.assertEquals(15, u.uniqueLetterString("ABBAB"));
    }

}

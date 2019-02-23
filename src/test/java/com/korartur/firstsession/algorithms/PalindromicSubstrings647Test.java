package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class PalindromicSubstrings647Test {

    @Test
    public void Test1(){
        var p = new PalindromicSubstrings647();

        Assert.assertEquals(6, p.countSubstrings("aaa"));
    }

    @Test
    public void Test3(){
        var p = new PalindromicSubstrings647();

        Assert.assertEquals(15, p.countSubstrings("aaaaa"));
    }

    @Test
    public void Test2(){
        var p = new PalindromicSubstrings647();

        Assert.assertEquals(3, p.countSubstrings("abc"));
    }

    @Test
    public void Test4(){
        var p = new PalindromicSubstrings647();

        Assert.assertEquals(6, p.countSubstrings("fdsklf"));
    }

}

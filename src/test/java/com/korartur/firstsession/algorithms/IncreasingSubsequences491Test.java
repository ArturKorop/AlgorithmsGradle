package com.korartur.firstsession.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class IncreasingSubsequences491Test {

    @Test
    public void Test1(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences(new int[]{4,6,7,7});

        Assert.assertEquals(8, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

    @Test
    public void Test2(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences(new int[]{4,3,2,1});

        Assert.assertEquals(0, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

    @Test
    public void Test3(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences(new int[]{3,2,3});

        Assert.assertEquals(2, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

    @Test
    public void Test12(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences2(new int[]{4,6,7,7});

        Assert.assertEquals(8, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

    @Test
    public void Test22(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences2(new int[]{4,3,2,1});

        Assert.assertEquals(0, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

    @Test
    public void Test32(){
        IncreasingSubsequences491 i = new IncreasingSubsequences491();

        List<List<Integer>> res = i.findSubsequences2(new int[]{3,2,3});

        Assert.assertEquals(2, res.size());

        for (int i1 = 0; i1 < res.size(); i1++) {
            List<Integer> r =res.get(i1);
            for (int i2 = 0; i2 < r.size(); i2++) {
                System.out.print(r.get(i2) + " ");
            }

            System.out.println();
        }
    }

}

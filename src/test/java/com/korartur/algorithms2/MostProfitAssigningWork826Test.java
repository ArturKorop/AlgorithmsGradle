package com.korartur.algorithms2;

import com.koratur.algorithms2.MostProfitAssigningWork826;
import org.junit.Assert;
import org.junit.Test;

public class MostProfitAssigningWork826Test {

    @Test
    public void test1(){
        var m = new MostProfitAssigningWork826();

        Assert.assertEquals(100, m.maxProfitAssignment(
                new int[]{2,4,6,8,10},
                new int[]{10,20,30,40,50},
                new int[]{4,5,6,7}));
    }

}

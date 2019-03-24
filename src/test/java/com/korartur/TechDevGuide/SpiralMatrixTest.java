package com.korartur.TechDevGuide;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixTest {
    @Test
    public void test1() {
        var s = new SpiralMatrix();
        int l = 5;
        var res = s.build(l);
        Assert.assertEquals(l, res.length);
        for (int i = 0; i < l; i++) {
            System.out.println();
            for (int j = 0; j < l; j++) {
                System.out.print(res[i][j] + " ");
            }
        }

        System.out.println();
    }

    @Test
    public void test2() {
        var s = new SpiralMatrix();
        int l = 6;
        var res = s.build(l);
        Assert.assertEquals(l, res.length);
        for (int i = 0; i < l; i++) {
            System.out.println();
            for (int j = 0; j < l; j++) {
                System.out.print(res[i][j] + " ");
            }
        }

        System.out.println();
    }
}

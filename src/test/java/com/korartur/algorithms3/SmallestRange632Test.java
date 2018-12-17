package com.korartur.algorithms3;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SmallestRange632Test {
    @Test
    public void test1() {
        var s = new SmallestRange632();
        var nums = List.of(
                List.of(4,10,15,24,26),
                List.of(0,9,12,20),
                List.of(5,18,22,30)
        );

        Assert.assertArrayEquals(new int[]{20,24}, s.smallestRange2(nums));
    }

    @Test
    public void test2() {
        var s = new SmallestRange632();
        var nums = List.of(
                List.of(11, 38, 83, 84, 84, 85, 88, 89, 89, 92),
                List.of(28, 61, 89),
                List.of(52, 77, 79, 80, 81),
                List.of(21, 25, 26, 26, 26, 27),
                List.of(9, 83, 85, 90),
                List.of(84, 85, 87),
                List.of(26, 68, 70, 71),
                List.of(36, 40, 41, 42, 45),
                List.of(-34, 21),
                List.of(-28, -28, -23, 1, 13, 21, 28, 37, 37, 38),
                List.of(-74, 1, 2, 22, 33, 35, 43, 45),
                List.of(54, 96, 98, 98, 99),
                List.of(43, 54, 60, 65, 71, 75),
                List.of(43, 46),
                List.of(50, 50, 58, 67, 69),
                List.of(7, 14, 15),
                List.of(78, 80, 89, 89, 90),
                List.of(35, 47, 63, 69, 77, 92, 94)
        );

        Assert.assertArrayEquals(new int[]{15, 84}, s.smallestRange(nums));
    }
}

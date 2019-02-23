package com.korartur.SecondSession.Algorithms1;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagrams49Test {
    @Test
    public void test1() {
        var g = new GroupAnagrams49();
        var input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        var res = g.groupAnagrams(input);

        Assert.assertEquals(3, res.size());
    }
}

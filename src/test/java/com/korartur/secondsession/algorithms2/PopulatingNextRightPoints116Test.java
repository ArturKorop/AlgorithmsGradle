package com.korartur.secondsession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class PopulatingNextRightPoints116Test {
    @Test
    public void test1() {
        var p = new PopulatingNextRightPoints116();
        var root1 = new PopulatingNextRightPoints116.Node(1);
        var root2 = new PopulatingNextRightPoints116.Node(2);
        var root3 = new PopulatingNextRightPoints116.Node(3);
        var root4 = new PopulatingNextRightPoints116.Node(4);
        var root5 = new PopulatingNextRightPoints116.Node(5);
        var root6 = new PopulatingNextRightPoints116.Node(6);
        var root7 = new PopulatingNextRightPoints116.Node(7);

        var root8  = new PopulatingNextRightPoints116.Node(8);
        var root9  = new PopulatingNextRightPoints116.Node(9);
        var root10  = new PopulatingNextRightPoints116.Node(10);
        var root11  = new PopulatingNextRightPoints116.Node(11);
        var root12  = new PopulatingNextRightPoints116.Node(12);
        var root13  = new PopulatingNextRightPoints116.Node(13);
        var root14  = new PopulatingNextRightPoints116.Node(14);
        var root15  = new PopulatingNextRightPoints116.Node(15);

        root1.left = root2;
        root1.right= root3;
        root2.left= root4;
        root2.right= root5;
        root3.left= root6;
        root3.right= root7;

        root4.left = root8;
        root4.right = root9;

        root5.left = root10;
        root5.right = root11;

        root6.left = root12;
        root6.right = root13;

        root7.left = root14;
        root7.right = root15;

        var res = p.connect(root1);

        Assert.assertEquals(res.next , null);

        Assert.assertEquals(root2.next , root3);

        Assert.assertEquals(root4.next , root5);
        Assert.assertEquals(root5.next , root6);
        Assert.assertEquals(root6.next , root7);

        Assert.assertEquals(root8.next, root9);
        Assert.assertEquals(root9.next, root10);
        Assert.assertEquals(root10.next, root11);
        Assert.assertEquals(root11.next, root12);
        Assert.assertEquals(root12.next, root13);
        Assert.assertEquals(root13.next, root14);
        Assert.assertEquals(root14.next, root15);

    }
}

package com.korartur.firstsession.algorithms3;

import com.korartur.utils.NestedInteger;
import com.korartur.utils.NestedIntegerImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FlattenNestedListIterator341Test {
    @Test
    public void test1() {

        List<NestedInteger> list = new ArrayList<>();
        NestedInteger l1 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l1.getList().add(new NestedIntegerImpl(1,null,true));
        l1.getList().add(new NestedIntegerImpl(1,null,true));


        NestedInteger l2 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l2.getList().add(new NestedIntegerImpl(1,null,true));
        l2.getList().add(new NestedIntegerImpl(1,null,true));

        list.add(l1);
        list.add(new NestedIntegerImpl(2, null, true));
        list.add(l2);


        var f = new FlattenNestedListIterator341(list);

        int[] res = new int[5];
        int i = 0;
        while (f.hasNext()){
            res[i] = f.next();
            i++;
        }

        Assert.assertArrayEquals(new int[]{1,1,2,1,1}, res);
    }

    @Test
    public void test2() {

        List<NestedInteger> list = new ArrayList<>();
        NestedInteger l1 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l1.getList().add(new NestedIntegerImpl(1,null,true));

        NestedInteger l2 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l2.getList().add(new NestedIntegerImpl(4,null,true));

        NestedInteger l3 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l3.getList().add(new NestedIntegerImpl(6,null, true));

        l2.getList().add(l3);

        list.add(l1);
        list.add(l2);

        var f = new FlattenNestedListIterator341(list);

        int[] res = new int[3];
        int i = 0;
        while (f.hasNext()){
            res[i] = f.next();
            i++;
        }

        Assert.assertArrayEquals(new int[]{1,4,6}, res);
    }

    @Test
    public void test3() {

        List<NestedInteger> list = new ArrayList<>();
        NestedInteger l1 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        list.add(l1);


        var f = new FlattenNestedListIterator341(list);


        Assert.assertFalse(f.hasNext());
    }

    @Test
    public void test4() {

        List<NestedInteger> list = new ArrayList<>();
        NestedInteger l1 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l1.getList().add(new NestedIntegerImpl(1,null,true));

        NestedInteger l3 = new NestedIntegerImpl(null, new ArrayList<>(), false);

        NestedInteger l2 = new NestedIntegerImpl(null, new ArrayList<>(), false);
        l2.getList().add(new NestedIntegerImpl(1,null,true));

        list.add(l1);
        list.add(l3);
        list.add(l2);


        var f = new FlattenNestedListIterator341(list);

        int[] res = new int[2];
        int i = 0;
        while (f.hasNext()){
            res[i] = f.next();
            i++;
        }

        Assert.assertArrayEquals(new int[]{1,1}, res);
    }
}

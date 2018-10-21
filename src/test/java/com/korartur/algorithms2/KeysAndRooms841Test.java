package com.korartur.algorithms2;

import com.koratur.algorithms2.KeysAndRooms841;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KeysAndRooms841Test {

    @Test
    public void test1(){
        var k = new KeysAndRooms841();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());

        Assert.assertTrue(k.canVisitAllRooms(rooms));
    }

    @Test
    public void test2(){
        var k = new KeysAndRooms841();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1,3));
        rooms.add(List.of(3,0,1));
        rooms.add(List.of(2));
        rooms.add(List.of());

        Assert.assertFalse(k.canVisitAllRooms(rooms));
    }

}

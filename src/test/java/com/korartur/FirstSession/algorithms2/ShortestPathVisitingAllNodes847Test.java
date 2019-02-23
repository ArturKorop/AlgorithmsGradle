package com.korartur.FirstSession.algorithms2;

import org.junit.Assert;
import org.junit.Test;

public class ShortestPathVisitingAllNodes847Test {

    @Test
    public void test1(){
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(4, s.shortestPathLength(new int[][]{
                {1,2,3},
                {0},
                {0},
                {0}
        }));
    }

    @Test
    public void test2(){
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(4, s.shortestPathLength(new int[][]{
                {1},
                {0,2,4},
                {1,3,4},
                {2},
                {1,2}
        }));
    }

    @Test
    public void test3(){
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(6, s.shortestPathLength(new int[][]{
                {1},
                {0,2,4},
                {1,3},
                {2},
                {1,5},
                {4}
        }));
    }

    @Test
    public void test4(){
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(9, s.shortestPathLength(new int[][]{
                {1},
                {0,2,6},
                {1,3},
                {2},
                {5},
                {4,6},
                {1,5,7},
                {6}
        }));
    }

    @Test
    public void test5(){
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(6, s.shortestPathLength(new int[][]{
                {1},
                {0,2,4},
                {1,3},
                {2},
                {1,5},
                {4},
        }));
    }

    @Test
    public void test6() {
        var s = new ShortestPathVisitingAllNodes847();

        Assert.assertEquals(11, s.shortestPathLength(new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11},
                {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11},
                {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11},
                {0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11},
                {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11},
                {0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}}));
    }


}

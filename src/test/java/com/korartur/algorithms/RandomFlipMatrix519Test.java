package com.korartur.algorithms;

import org.junit.Test;

public class RandomFlipMatrix519Test {

    @Test
    public void Test(){
        RandomFlipMatrix519 r = new RandomFlipMatrix519(4,4);


//        for (int i = 0; i < 1000; i++) {
//            for (int t = 0; t < 5; t++) {
//                int[] res = r.flip();
//                //System.out.println(res[0] + " : " + res[1]);
//            }
//
//            r.reset();
//            System.out.println(i);
//        }

//        int[][] t = new int[10000][10000];
//        for (int i = 0; i < 10000; i++) {
//            for (int i1 = 0; i1 < 10000; i1++) {
//                t[i][i1] = i;
//            }
//        }
//
//        HashMap<Integer, int[]> m = new HashMap<>();


        for (int i = 0; i < 16; i++) {
            int[] res = r.flip();

            System.out.println(res[0] + " : " + res[1]);
        }

        r.reset();

        System.out.println("-------------");

        for (int i = 0; i < 16; i++) {
            int[] res = r.flip();

            System.out.println(res[0] + " : " + res[1]);
        }

    }

}

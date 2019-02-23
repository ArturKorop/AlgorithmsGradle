package com.korartur.firstsession.algorithms3;

import org.junit.Test;

public class InsertDeleteGetRandom381Test {
    @Test
    public void test1() {
        var i = new InsertDeleteGetRandom381();
        i.insert(1);
        i.insert(1);
        i.insert(2);
        i.insert(2);
        i.insert(2);


        int total = 1000000;

        int count1 = 0;
        int count2 = 0;
        for(int q= 0; q < total; q++){
            if(i.getRandom() == 1){
                count1++;
            } else {
                count2++;
            }
        }

        System.out.print("Count 1: " + Math.round((double) (count1 * 100)/total) + "%\n");
        System.out.print("Count 2: " + Math.round((double) (count2 * 100)/total) + "%\n");

        i.remove(2);

         count1 = 0;
         count2 = 0;
        for(int q= 0; q < total; q++){
            if(i.getRandom() == 1){
                count1++;
            } else {
                count2++;
            }
        }

        System.out.print("Count 1: " + Math.round((double) (count1 * 100)/total) + "%\n");
        System.out.print("Count 2: " + Math.round((double) (count2 * 100)/total) + "%\n");

        i.insert(2);
        i.remove(1);
        i.insert(2);

        count1 = 0;
        count2 = 0;
        for(int q= 0; q < total; q++){
            if(i.getRandom() == 1){
                count1++;
            } else {
                count2++;
            }
        }

        System.out.print("Count 1: " + Math.round((double) (count1 * 100)/total) + "%\n");
        System.out.print("Count 2: " + Math.round((double) (count2 * 100)/total) + "%\n");
    }

}

package com.korartur.algorithms;

import java.util.Random;

public class rand10UsingRand7470 {
    private Random rand = new Random();

    private int rand7(){
        return rand.nextInt(7)+1;
    }

    public int rand10(){

        while(true)
        {
            int c = 7 * (rand7() - 1) + rand7();
            if(c <= 40)
            {
                return c%10+1;
            }
        }
    }
}

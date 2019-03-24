package com.korartur.TechDevGuide;

public class Dividers {
    public int smallestCommonMultiplication(int x, int y) {
        int gcd = greaterCommonDivider(x ,y);
        int xP = x / gcd;
        int yP = y / gcd;

        return gcd * xP * yP;
    }

    public int greaterCommonDivider(int x, int y) {
        while (x != y ){
            if(x > y){
                x = x - y;
            }
            else {
                y = y - x;
            }
        }

        return y;
    }
}

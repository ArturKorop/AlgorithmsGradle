package com.korartur.secondsession.algorithms1;

public class StringWithioutAAAorBBB984 {
    public String strWithout3a3b(int A, int B) {
        if(A == B){
            String s = "";
            for (int i = 0; i < A; i++) {
                s += "ab";
            }

            return s;
        }


        int desiredDoubleB = 0;
        int desiredDoubleA = 0;
        int desiredSingleB = 0;
        int desiredSingleA = 0;

        if(A > B){
            desiredSingleB = B;
            int totalASub = B + 1;

            desiredDoubleA = A - totalASub;
            desiredSingleA = A - desiredDoubleA * 2;
        }
        else{
            desiredSingleA = A;
            int totalBSub = A + 1;

            desiredDoubleB = B - totalBSub;
            desiredSingleB = B - desiredDoubleB * 2;
        }

        int doubleACount = 0;
        int doubleBCount = 0;
        int singleACount = 0;
        int singleBCount = 0;

        String s = "";
        if(A > B){
            while (doubleACount < desiredDoubleA || singleACount < desiredSingleA) {

                if (doubleACount < desiredDoubleA) {
                    doubleACount++;
                    s += "aa";
                } else if (singleACount < desiredSingleA) {
                    singleACount++;
                    s += "a";
                }

                if (doubleBCount < desiredDoubleB) {
                    doubleBCount++;
                    s += "bb";
                } else if (singleBCount < desiredSingleB) {
                    singleBCount++;
                    s += "b";
                }
            }
        }
        else{
            while (doubleBCount < desiredDoubleB || singleBCount < desiredSingleB) {

                if (doubleBCount < desiredDoubleB) {
                    doubleBCount++;
                    s += "bb";
                } else if (singleBCount < desiredSingleB) {
                    singleBCount++;
                    s += "b";
                }

                if (doubleACount < desiredDoubleA) {
                    doubleACount++;
                    s += "aa";
                } else if (singleACount < desiredSingleA) {
                    singleACount++;
                    s += "a";
                }
            }
        }


        return s;

    }
}

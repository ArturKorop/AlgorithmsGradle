package com.korartur.FirstSession.algorithms2;

public class ShiftingLetters848 {

    public String shiftingLetters(String S, int[] shifts) {
        int[] finalShift = new int[shifts.length];
        int firstShift = 0;

        for (int i = 0; i < shifts.length; i++) {
            shifts[i] = shifts[i] % 26;
            firstShift += shifts[i];
        }

        finalShift[0] = firstShift;

        for (int i = 1; i < shifts.length; i++) {
            firstShift -= shifts[i-1];
            finalShift[i] = firstShift;
        }

        for (int i = 0; i < finalShift.length; i++) {
            finalShift[i] = finalShift[i] % 26;
        }

        char[] c = S.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = shift(c[i], finalShift[i]);
        }

        return String.valueOf(c);
    }


    private char shift(char c, int shift){
        int ind = c - 'a';
        ind += shift;
        ind = ind % 26;

        return (char)(ind + 'a');
    }


}

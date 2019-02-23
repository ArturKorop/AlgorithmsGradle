package com.korartur.FirstSession.algorithms3;

public class VerifyProrderSerialization331 {
    public boolean isValidSerialization(String preorder) {

        String[] st = preorder.split(",");
        Character[] c = new Character[st.length];

        for (int i = 0; i < st.length; i++) {
            c[i] = st[i].charAt(0);
        }

        int last = getLastFromHead(c, 0);

        return last == c.length-1;

    }

    private int getLastFromHead(Character[] c, int head){
        if(head >= c.length) return -1;
        if(c[head] == '#') return head;

        int lastLeft = getLastFromHead(c, head+1);
        if(lastLeft == -1) return -1;
        int lastRight = getLastFromHead(c, lastLeft+1);

        return lastRight;
    }
}

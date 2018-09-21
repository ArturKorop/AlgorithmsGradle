package com.korartur.algorithms;

import com.koratur.algorithms.ReorganizeString767;
import org.junit.Assert;
import org.junit.Test;

public class ReorganizeString767Test {

    @Test
    public void Test1(){
        var r = new ReorganizeString767();

        Assert.assertEquals("aba", r.reorganizeString("aab"));
    }

    @Test
    public void Test2(){
        var r = new ReorganizeString767();

        Assert.assertEquals("vovlv", r.reorganizeString("vvvlo"));
    }

    @Test
    public void Test3(){
        var r = new ReorganizeString767();

        String s = "ogccckcwmbmxtsbmozli";
        validate(r.reorganizeString(s), s.length());
    }
     @Test
    public void Test4(){
        var r = new ReorganizeString767();

        String s = "tndsewnllhrtwsvxenkscbivijfqnysamckzoyfnapuotmdexzkkrpmppttficzerdndssuveompqkemtbwbodrhwsfpbmkafpwyedpcowruntvymxtyyejqtajkcjakghtdwmuygecjncxzcxezgecrxonnszmqmecgvqqkdagvaaucewelchsmebikscciegzoiamovdojrmmwgbxeygibxxltemfgpogjkhobmhwquizuwvhfaiavsxhiknysdghcawcrphaykyashchyomklvghkyabxatmrkmrfsppfhgrwywtlxebgzmevefcqquvhvgounldxkdzndwybxhtycmlybhaaqvodntsvfhwcuhvuccwcsxelafyzushjhfyklvghpfvknprfouevsxmcuhiiiewcluehpmzrjzffnrptwbuhnyahrbzqvirvmffbxvrmynfcnupnukayjghpusewdwrbkhvjnveuiionefmnfxao";
        validate(r.reorganizeString(s), s.length());

    }

    private void validate(String s, int expectedSize){
        Assert.assertEquals(s.length() , expectedSize);

        boolean correct = true;
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                correct = false;
                break;
            }
        }

        Assert.assertTrue(correct);
    }


}

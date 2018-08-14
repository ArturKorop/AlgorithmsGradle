package com.korartur.algorithms;

import com.koratur.algorithms.LongestWordInDictionaryThroughDeleting524;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LongestWordInDictionaryThroughDeleting524Test {

    @Test
    public void Test1(){
        LongestWordInDictionaryThroughDeleting524 l = new LongestWordInDictionaryThroughDeleting524();

        Assert.assertEquals("apple", l.findLongestWord("abpcplea", List.of("ale", "monkey", "plea", "apple")));
    }

    
}

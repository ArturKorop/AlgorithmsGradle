package com.korartur.FirstSession.algorithms;

import org.junit.Test;

import java.util.List;

public class AllPathsFromSourceToTarget797Test {

    @Test
    public void test1(){
        var a = new AllPathsFromSourceToTarget797();

        List<List<Integer>>  res = a.allPathsSourceTarget(new int[][]{
                {1,2},
                {3},
                {3},
                {}
        });

        ContainsArray(res, new int[]{0,1,3});
        ContainsArray(res, new int[]{0,2,3});
    }

    private void ContainsArray(List<List<Integer>> source, int[] target){
        for (List<Integer> data : source) {
            if(data.size() == target.length){
                boolean ok = true;
                for(int i = 0; i < target.length;i++){
                    if(data.get(i) != target[i]){
                        ok = false;
                        break;
                    }
                }

                if(ok){
                    return;
                }
            }
        }

        throw new AssertionError("Expected array not exists");

    }

}

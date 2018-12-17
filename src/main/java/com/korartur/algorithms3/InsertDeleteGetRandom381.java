package com.korartur.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom381 {

    private HashMap<Integer, List<Integer>> map = new HashMap<>();
    List<Integer> data = new ArrayList<>();
    private Random r = new Random();



    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        data.add(val);
        if(map.containsKey(val)){
            map.get(val).add(data.size()-1);
            return false;
        } else {
            List<Integer> indexes = new ArrayList<>();
            indexes.add(data.size()-1);
            map.put(val, indexes);
            return true;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;

        List<Integer> indexes = map.get(val);
        int indexToDelete = -1;
        if(indexes.size() == 1){
            indexToDelete = indexes.get(0);
            map.remove(val);
        } else {
            indexToDelete = indexes.get(indexes.size()-1);
            indexes.remove(indexes.size()-1);
        }

        if(indexToDelete == data.size()-1){
            data.remove(data.size()-1);
        } else {
            int valueToReplace = data.get(data.size() - 1);
            data.set(indexToDelete, valueToReplace);
            data.remove(data.size() - 1);
            List<Integer> replIndexes = map.get(valueToReplace);
            replIndexes.remove((Object)data.size());
            replIndexes.add(indexToDelete);
        }

        return true;
    }

    /** Get a random element from the collection. */
    public int getRandom() {
        int ind = r.nextInt(data.size());
        return data.get(ind);
    }
}

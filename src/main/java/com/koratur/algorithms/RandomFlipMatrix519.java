package com.koratur.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomFlipMatrix519 {

    Map<Integer, Integer> map;
    int rows, cols, total;
    Random rand;

    public RandomFlipMatrix519(int n_rows, int n_cols) {
        map = new HashMap<>();
        rand = new Random();
        rows = n_rows;
        cols = n_cols;
        total = rows * cols;
    }

    public int[] flip() {
        int r = rand.nextInt(total--);
        int x = map.getOrDefault(r, r);
        map.put(r, map.getOrDefault(total, total));
        return new int[]{x / cols, x % cols};
    }

    public void reset() {
        map.clear();
        total = rows * cols;
    }
}

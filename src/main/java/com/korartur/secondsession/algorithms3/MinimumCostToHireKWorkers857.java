package com.korartur.secondsession.algorithms3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MinimumCostToHireKWorkers857 {

    public double mincostToHireWorkers2(int[] q, int[] w, int K) {
        double[][] workers = new double[q.length][2];
        for (int i = 0; i < q.length; ++i)
            workers[i] = new double[]{(double)(w[i]) / q[i], (double)q[i]};
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));
        double res = Double.MAX_VALUE, qsum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (double[] worker: workers) {
            qsum += worker[1];
            pq.add(-worker[1]);
            if (pq.size() > K) qsum += pq.poll();
            if (pq.size() == K) res = Math.min(res, qsum * worker[0]);
        }
        return res;
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        int l = quality.length;
        Worker[] workers = new Worker[l];
        for (int i = 0; i < l; i++) {
            double ratio = (double) wage[i] / (double) quality[i];
            workers[i] = new Worker();
            workers[i].wage = wage[i];
            workers[i].quality = quality[i];
            workers[i].ratio = ratio;
        }

        double min = Double.MAX_VALUE;
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < l; i++) {
            int base = i;
            visited.add(base);

            double cost = getCost(base, visited, workers, K);
            if(cost != Double.MAX_VALUE) {
                min = Math.min(min, cost + workers[base].wage);
            }

            visited.remove(base);
        }

        return min;
    }

    private double getCost(int base, HashSet<Integer> visited, Worker[] workers, int K){
        if(visited.size() == K) return 0;

        double ration = workers[base].ratio;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < workers.length; i++) {
            if(i == base || visited.contains(i)) continue;

            double current = ration * workers[i].quality;
            if(current < workers[i].wage) continue;

            visited.add(i);
            double other = getCost(base, visited, workers, K);
            visited.remove(i);
            if(other == Double.MAX_VALUE) continue;

            if(current + other < min){
                min = current + other;
            }
        }

        return min;
    }

    private class  Worker{
        public int wage;
        public int quality;
        public double ratio;
    }
}

package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EvaluateDivision399 {
    private class Operation{
        public String above;
        public String below;
        public double value;

        public Operation(String above, String below, double value) {
            this.above = above;
            this.below = below;
            this.value = value;
        }
    }

    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String, HashSet<String>> relatedMap = new HashMap<>();
        HashMap<String, List<Operation>> operations = new HashMap<>();

        for (int i = 0; i < equations.length; i++) {

            String above = equations[i][0];
            String below = equations[i][1];

            if(!relatedMap.containsKey(above) && !relatedMap.containsKey(below)){
                HashSet<String> cur = new HashSet<>();
                cur.add(above);
                cur.add(below);

                relatedMap.put(above, cur);
                relatedMap.put(below, cur);
            } else if(relatedMap.containsKey(above) && relatedMap.containsKey(below)){
                HashSet<String> aboveSet = relatedMap.get(above);
                HashSet<String> belowSet = relatedMap.get(below);

                if(aboveSet == belowSet) continue;

                aboveSet.addAll(belowSet);

                for (String belowKey : belowSet) {
                    relatedMap.put(belowKey, aboveSet);
                }

            } else if(relatedMap.containsKey(above)){
                relatedMap.get(above).add(below);
                relatedMap.put(below, relatedMap.get(above));
            } else {
                relatedMap.get(below).add(above);
                relatedMap.put(above, relatedMap.get(below));
            }


            Operation op = new Operation(equations[i][0], equations[i][1], values[i]);
            if(!operations.containsKey(above)){
                operations.put(above, new ArrayList<>());
            }

            operations.get(above).add(op);

            if(!operations.containsKey(below)){
                operations.put(below, new ArrayList<>());
            }

            operations.get(below).add(op);

        }

        double[] result = new double[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String above = queries[i][0];
            String below = queries[i][1];

            if(!relatedMap.containsKey(above)|| !relatedMap.containsKey(below)){
                result[i] = -1;
            } else {
                if(relatedMap.get(above) != relatedMap.get(below)){
                    result[i] = -1;
                } else {
                    if(above.equals(below)){
                        result[i] = 1;
                    } else {
                        result[i] = calc(above, below, new HashSet<String>(), operations);
                    }
                }
            }

        }

        return result;
    }

    private double calc(String above, String below, HashSet<String> used, HashMap<String, List<Operation>> operations) {
        List<Operation> aboveOperations = operations.get(above);

        for (Operation aboveOperation : aboveOperations) {
            if(aboveOperation.above.equals(above) && aboveOperation.below.equals(below)){
                return aboveOperation.value;
            } else if(aboveOperation.above.equals(below) && aboveOperation.below.equals(above)){
                return (double) 1/aboveOperation.value;
            } else {
                if(used.contains(aboveOperation.above) || used.contains(aboveOperation.below)) continue;
                used.add(above);

                if(aboveOperation.above.equals(above)){
                    double res = aboveOperation.value * calc(aboveOperation.below, below, used, operations);
                    if(res >= 0) return res;
                    used.remove(above);
                } else {
                    double res = calc(aboveOperation.above, below, used, operations) / aboveOperation.value;
                    if(res >= 0) return res;
                    used.remove(above);
                }
            }
        }

        return -1;

    }
}

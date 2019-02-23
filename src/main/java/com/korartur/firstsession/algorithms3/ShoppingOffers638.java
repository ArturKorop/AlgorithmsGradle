package com.korartur.firstsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingOffers638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

        for (List<Integer> sp : special) {
            int sum = 0;
            for (int i = 0; i < sp.size()-1; i++) {
                sum += sp.get(i);
            }

            sp.add(sum);
        }

        int totalNeeds = 0;
        for (Integer need : needs) {
            totalNeeds += need;
        }

        int res = getBestPrice(needs, price, special, totalNeeds);

        return res;
    }

    private int getBestPrice(List<Integer> needs, List<Integer> price, List<List<Integer>> special, int totalNeeds){
        int min = 0;
        for (int i = 0; i < needs.size(); i++) {
            min += needs.get(i) * price.get(i);
        }

        for (List<Integer> sp : special) {

            if(totalNeeds < sp.get(sp.size()-1)) continue;

            List<Integer> currentNeeds = new ArrayList<>();

            for (int i = 0; i < needs.size(); i++) {
                int newNeed = needs.get(i) - sp.get(i);
                if(newNeed < 0) {
                    currentNeeds = null;
                    break;
                }

                currentNeeds.add(newNeed);
            }


            if(currentNeeds != null){
                int currentMin = sp.get(sp.size()-2);

                currentMin += getBestPrice(currentNeeds, price, special, totalNeeds - sp.get(sp.size()-1));
                if(currentMin < min) min = currentMin;
            }

        }

        return min;

    }
}

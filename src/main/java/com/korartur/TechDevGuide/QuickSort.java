package com.korartur.TechDevGuide;

public class QuickSort {


    public void sort(int[] input) {
        sortImpl(input, 0, input.length - 1);
    }

    private void sortImpl(int[] input, int low, int high){

        if(low >= high){
            return;
        }

        if(high - low == 1){
            if(input[high] > input[low]) return;

            var temp = input[high];
            input[high] = input[low];
            input[low] = temp;
            return;
        }

        var pivotIndex = parition(input, low, high);
        sortImpl(input, low, pivotIndex-1);
        sortImpl(input, pivotIndex+1, high);

    }

    private int parition(int[] input, int low, int high) {
        var pivot = input[high];

        var i = low;
        var j = high - 1;
        var lastHighIndex = j;

        while (i < j) {

            if (input[i] >= pivot) {
                while (i < j) {
                    if (input[j] < pivot) {
                        var temp = input[i];
                        input[i] = input[j];
                        input[j] = temp;
                        i++;
                        j--;
                        break;
                    } else {
                        j--;
                    }
                }
            } else {
                i++;
            }
        }

        if(input[j] >= pivot) {
            input[high] = input[j];
            input[j] = pivot;
        }
        else{
            input[high] = input[j+1];
            input[j+1] = pivot;
        }

        return j;
    }

}

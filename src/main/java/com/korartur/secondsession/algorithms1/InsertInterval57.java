package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();

        boolean insertionStarted = false;
        boolean insertionFinished = false;
        for(int i = 0 ; i < intervals.size(); i++){
            Interval current = intervals.get(i);

            if(!insertionStarted){
                if(current.end < newInterval.start){
                    result.add(current);
                }
                else{
                    if(current.start > newInterval.end){
                        result.add(newInterval);
                        result.add(current);
                        insertionStarted = true;
                        insertionFinished = true;
                    }
                    else {
                        newInterval.start = Math.min(newInterval.start, current.start);
                        newInterval.end = Math.max(newInterval.end, current.end);
                        insertionStarted = true;
                    }
                }
            }
            else if(insertionStarted && !insertionFinished){
                if(current.start > newInterval.end){
                    result.add(newInterval);
                    result.add(current);
                    insertionFinished = true;
                }
                else {
                    newInterval.start = Math.min(newInterval.start, current.start);
                    newInterval.end = Math.max(newInterval.end, current.end);
                    insertionStarted = true;
                }
            }
            else{
                result.add(current);
            }
        }

        if(!insertionFinished){
            result.add(newInterval);
        }

        return result;
    }

    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}

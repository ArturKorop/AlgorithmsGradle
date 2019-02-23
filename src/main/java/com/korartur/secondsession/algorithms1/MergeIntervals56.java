package com.korartur.secondsession.algorithms1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() < 2) return intervals;

        intervals.sort(new IntervalComparator());

        List<Interval> result = new ArrayList<>();
        result.add(new Interval(intervals.get(0).start, intervals.get(0).end));

        Interval last = result.get(0);

        for(int i = 1; i < intervals.size(); i++){
            Interval current = intervals.get(i);
            if(last.end < current.start){
                last = new Interval(current.start, current.end);
                result.add(last);
            }
            else{
                last.end = Math.max(current.end, last.end);
            }
        }

        return result;
    }

    public class IntervalComparator implements Comparator<Interval>{

        @Override
        public int compare(Interval a, Interval b) {
            if(a.start != b.start){
                return a.start - b.start;
            }

            return a.end - b.end;
        }
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

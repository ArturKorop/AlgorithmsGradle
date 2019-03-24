package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CourseSchedule207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;

        List<Integer>[] prereqTo = new List[numCourses];

        for (int i = 0; i < numCourses; i++) {
            prereqTo[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int from = prerequisites[i][0];
            int to = prerequisites[i][1];

            if(from == to) return false;

            prereqTo[from].add(to);
        }

        int[] dp = new int[numCourses];

        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){

            if(!can(i, prereqTo, visited, dp)){
                return false;
            }
        }

        return true;
    }

    private boolean can(int course, List<Integer>[] prereqTo, int[] visited, int[] dp){
        if(dp[course] == 1) return true;

        if(visited[course] == 1) return false;

        if(prereqTo[course].size() != 0){
            visited[course] = 1;
            Integer[] to = prereqTo[course].toArray(new Integer[0]);

            for (Integer prTo : to) {
                if(!can(prTo, prereqTo, visited, dp)){
                    return false;
                }
            }
        }

        dp[course] = 1;

        return true;
    }
}

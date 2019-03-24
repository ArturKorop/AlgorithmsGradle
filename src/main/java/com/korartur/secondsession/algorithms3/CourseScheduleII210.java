package com.korartur.secondsession.algorithms3;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII210 {
    private int[] res;
    private int index = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        res = new int[numCourses];
        index = 0;

        List<Integer>[] map = new List[numCourses];

        for (int i = 0; i < numCourses; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int from = prerequisites[i][0];
            int to = prerequisites[i][1];
            map[from].add(to);
        }

        int[] finished = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            int[] visited = new int[numCourses];
            if(!can(i, map, visited, finished)){
                return new int[0];
            }
        }

        return res;
    }

    private boolean can(int course, List<Integer>[] map, int[] visited, int[] finished){
        if(visited[course] == 1) return false;
        if(finished[course] == 1) return true;

        List<Integer> prepreq = map[course];

        visited[course] = 1;
        for (Integer pre : prepreq) {
            if(!can(pre, map, visited, finished)){
                return false;
            }
        }

        visited[course] = 0;

        finished[course] = 1;
        res[index++] = course;

        return true;
    }

}

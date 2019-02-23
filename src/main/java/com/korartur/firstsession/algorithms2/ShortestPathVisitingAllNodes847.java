package com.korartur.firstsession.algorithms2;

public class ShortestPathVisitingAllNodes847 {

    public int shortestPathLength(int[][] graph) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < graph.length; i++) {
            if(graph[i].length < min){
                min = graph[i].length;
            }
        }
        int res = Integer.MAX_VALUE;

        for (int q = 0; q < graph.length; q++) {
            if(graph[q].length == min){
                int startNode = q;
                int[] visited = new int[graph.length];
                visited[startNode] = 1;


                int[][] map = new int[graph.length][graph.length];
                int[] mapVisited = new int[graph.length];

                for (int i = 0; i < graph.length; i++) {
                    mapVisited[i] = 1;
                    for (int t = 0; t < graph.length; t++) {
                        map[i][t] = getDistances(graph, map, i, t, mapVisited);
                    }

                    mapVisited[i] = 0;
                }


                int curRes = visitAll(startNode, graph, visited, map);
                if(curRes < res) res = curRes;
            }
        }

        return res;

    }

    private int getDistances(int[][] graph, int[][] distances, int from, int to, int[] visited){
        if(from == to) return 0;
        if(distances[from][to] > 0) return distances[from][to];

        int[] directConnection = graph[from];
        for (int i = 0; i < directConnection.length; i++) {
            if(directConnection[i] == to) {
                distances[from][to] = 1;
                distances[to][from] = 1;
                return 1;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < directConnection.length; i++) {
            int conn = directConnection[i];
            if(visited[conn] == 1) continue;

            visited[conn] = 1;
            int current = getDistances(graph, distances, conn, to, visited);
            visited[conn] = 0;
            if(current == Integer.MAX_VALUE)continue;

            current += 1;


            if(current < min){
                min = current;
            }
        }

        if(min == Integer.MAX_VALUE) return min;

        distances[from][to] = min;
        distances[to][from] = min;

        return min;
    }

    private int visitAll(int startNode, int[][] graph, int[] visited, int[][] map) {

        int notVisitedCount = 0;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == 0){
                notVisitedCount++;
            }
        }

        if(notVisitedCount == 0) return 0;

        int[] connections = graph[startNode];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < connections.length; i++) {
            if(visited[connections[i]] == 0){
                visited[connections[i]] = 1;
                int current = visitAll(connections[i], graph, visited, map);
                if(current < min){
                    min = current;
                }
                visited[connections[i]] = 0;

                if(min == notVisitedCount-1) return min+1;

            }
        }

        if(min != Integer.MAX_VALUE) return min + 1;


        for (int i = 0; i < visited.length; i++) {
            if(visited[i] == 0){
                int dist = map[startNode][i];
                visited[i] = 1;
                int curr = dist + visitAll(i, graph, visited, map);
                visited[i] = 0;

                if(curr < min){
                    min = curr;
                }

                if(min == notVisitedCount - 1) return min+1;
            }
        }

        return min;

    }

}

package GRAPHS;
import java.util.*;
public class TOPOLOGICAL_SORT_DFS {
        static class Edge{
            int src;
            int dest;
            int wt;

            Edge(int src,int dest,int wt){
                this.src=src;
                this.dest=dest;
            }
        }
        static void createGraph(ArrayList<Edge>graph[]){
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
            }
            // 0->vertex
            graph[0].add(new Edge(0,4,1));

            // 1->vertex
            graph[1].add(new Edge(1,3,1));

            // 2->vertex
            graph[2].add(new Edge(2,3,1));

//            // 3->vertex
//            graph[3].add(new Edge(3,2,1));
//            graph[3].add(new Edge(3,1,1));

            // 4->vertex
            graph[4].add(new Edge(4,2,1));


            // 5->vertex
            graph[5].add(new Edge(5,0,1));
            graph[5].add(new Edge(5,1,1));
        }
        public static void topSort(ArrayList<Edge>[]graph){
            boolean visit[]=new boolean[graph.length];
            Stack<Integer>s=new Stack<>();
            for(int i=0;i<graph.length;i++){
                if(!visit[i]){
                    topSortUtil(graph,i,visit,s);
                }
            }
            while(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
    private static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit, Stack<Integer> s) {
           visit[curr]=true;
           for(int i=0;i<graph[curr].size();i++){
               Edge e=graph[curr].get(i);
               if(!visit[e.dest]){
                   topSortUtil(graph,e.dest,visit,s);
               }
           }
           s.push(curr);
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}

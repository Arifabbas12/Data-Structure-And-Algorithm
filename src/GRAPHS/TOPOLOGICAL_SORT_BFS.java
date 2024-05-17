package GRAPHS;
import java.util.*;

public class TOPOLOGICAL_SORT_BFS {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        // 2->vertex
        graph[2].add(new Edge(2,3,1));

        // 3->vertex
        graph[3].add(new Edge(3,1,1));

        // 4->vertex
        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));

        // 5->vertex
        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
    }
    public static void calcIn_Deg(ArrayList<Edge>[]graph,int InDeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                InDeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[]graph){
        int InDeg[]=new int[graph.length];
        calcIn_Deg(graph,InDeg);
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<InDeg.length;i++){
            if(InDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                InDeg[e.dest]--;
                if(InDeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}

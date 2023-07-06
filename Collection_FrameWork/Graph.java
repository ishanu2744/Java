package Collection_FrameWork;
import java.util.*;
import java.util.LinkedList;

public class Graph {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }
        System.out.println("Enter how many Nodes want to add with every vertices..");
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Enter Number of Nodes for Vertex "+i+" :" );
            Scanner sc=new Scanner(System.in);
            int node= sc.nextInt();
            for (int j = 1; j <= node; j++) {
                System.out.print("Enter node "+j+" of Vertex "+i+" :");
                int d= sc.nextInt();
                graph[i].add(new Edge(i,d));
            }
        }
        System.out.println("The Graph is...");
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i);
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e=graph[i].get(j);
                System.out.print(" -> "+ e.dest);
            }
            System.out.println();
        }
        BFS(graph, graph.length);
    }
    public static void BFS(ArrayList<Edge>graph[], int v){
        System.out.println("BFS of the Graph....");
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        System.out.println("Choose the starting node: ");
//        Scanner sc=new Scanner(System.in);
        q.add(0);
        while (!q.isEmpty()){
            int cur=q.remove();
            if (vis[cur]==false){
                System.out.print(cur+"->");
                vis[cur]=true;
                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e=graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Vertices: ");
        int v= sc.nextInt();
        ArrayList<Edge>graph[]=new ArrayList[v];
        createGraph(graph);
    }
}

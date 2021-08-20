package javaproject;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
    private LinkedList<Integer> adj[];
    private int vertex;
    public BFS(int vertex)
    {
        this.vertex = vertex;
        adj = new LinkedList[vertex];
        for(int i=0; i<vertex; i++)
        {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    void bfs(int s)
    {
        boolean[] visited = new boolean[vertex];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while(queue.size()!=0){
            s = queue.pop();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFS b = new BFS(4);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
        System.out.println("BFS - >\n");
        b.bfs(2);
    }
}

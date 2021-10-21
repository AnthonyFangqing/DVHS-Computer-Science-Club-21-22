import java.util.ArrayList;

public class dfs {

    ArrayList<Integer>[] adj = new ArrayList[8];
    boolean[] visited = new boolean[8];

    public static void main(String[] args){
        dfs o = new dfs();
        o.run();
    }
    public void run() {
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        addEdge(4,5);
        addEdge(5,7);
        addEdge(5,1);
        addEdge(5,2);
        addEdge(1,3);
        addEdge(1,6);

        dfs(4);
    }
    public void dfs(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;

        for (int child : adj[node]) {
            dfs(child);
        }

        doSomething(node);


    }
    public void doSomething(int node) {
        System.out.println(node);
    }

    public void addEdge(int a, int b) {
        adj[a].add(b);
        adj[b].add(a);
    }
}

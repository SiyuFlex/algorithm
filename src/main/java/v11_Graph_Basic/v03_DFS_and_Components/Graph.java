package main.java.v11_Graph_Basic.v03_DFS_and_Components;

// 图的接口
public interface Graph {

    public int V();
    public int E();
    public void addEdge( int v , int w );
    boolean hasEdge( int v , int w );
    void show();
    public Iterable<Integer> adj(int v);
}

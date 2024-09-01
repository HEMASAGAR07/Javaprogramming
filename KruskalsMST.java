package DSA_LAB;

import java.util.*;

class Edge implements Comparable<Edge>
{
    int src,dest,weight;
    public Edge(int src,int dest,int weight)
    {
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
    public int compareTo(Edge other)
    {
        return this.weight-other.weight;
    }
}
 
public class KruskalsMST
{
    private int V;
    private List<Edge> edges;
    public KruskalsMST(int V)
    {
        this.V=V;
        edges=new ArrayList<>();
    }
    public void addEdge(int src,int dest,int weight)
    {
       // System.out.println("Enter");
        Edge edge=new Edge(src,dest,weight);
        edges.add(edge);
    }
    private int find(int[] parent,int v)
    {
        if(parent[v]!=v)
        {
            parent[v]=find(parent,parent[v]);
        }
        return parent[v];
    }
    private void union(int[] parent,int[] rank,int u,int v)
    {
        int rootU=find(parent,u);
        int rootV=find(parent,v);
        if(rank[rootU]<rank[rootV])
        {
            parent[rootU]=rootV;
        }
        else if(rank[rootU]>rank[rootV])
        {
            parent[rootV]=rootU;
        }
        else
        {
             parent[rootV]=rootU;
             rank[rootU]++;
        }
    }
    public List<Edge> kruskal()
    {
        List<Edge> mst = new ArrayList<>();
        Collections.sort(edges);
        int[] parent=new int[V];
        int[] rank=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
            rank[i]=0;
        }
        int e=0;
        int i=0;
        while(i<V-1 && e<edges.size())
        {
            Edge next=edges.get(e++);
            int x=find(parent,next.src);
            int y=find(parent,next.dest);
            if(x!=y)
            {
                mst.add(next);
                union(parent,rank,x,y);
                i++;
            }
        }
        return mst;
    }
    public static void main(String[] args)
    {
        int V=6;
        KruskalsMST k=new KruskalsMST(V);
        k.addEdge(0,1,4);
        k.addEdge(0,2,3);
        k.addEdge(1,2,1);
        k.addEdge(1,3,2);
        k.addEdge(2,3,4);
        k.addEdge(3,4,2);
        k.addEdge(4,5,6);
        List<Edge> mst=k.kruskal();
        System.out.println("Edges of MST:");
        for(Edge edge:mst)
        {
            System.out.println(edge.src+"-->"+edge.dest+"-->"+edge.weight);
        }
    }
}
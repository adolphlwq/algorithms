
// package xyz.adolphlwq.algs4.graph;

import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.*;

public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
        this.V = V;
        this.E = 0;
    
        adj = (Bag<Integer>[]) new Bag[V];
        for(int v=0; v< V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public Graph(In in) {
        try{
            this.V = in.readInt();
            this.E = in.readInt();
            if (V < 0) throw new IllegalArgumentException("Number of vertices must be nonnegative");
            if (E < 0) throw new IllegalArgumentException("Number of edges must be nonnegative");

            adj = (Bag<Integer>[]) new Bag[V];
            for (int v=0; v<V; v++) {
                adj[v] = new Bag<Integer>();
            }

            for (int i=0; i<E; i++) {
                int v = in.readInt();
                int w = in.readInt();
                addEdge(v, w);
            }
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException("invalid input format in Graph constructor", e);
        }
    }

    public Graph(Graph G) {
        this.V = G.V();
        E = G.E();

        for (int v=0; v<G.V(); v++) {
            Stack<Integer> reverse = new Stack<Integer>();
            for (int w : G.adj[v]) {
                reverse.push(w);
            }

            for(int w : reverse) {
                addEdge(v, w);
            }
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V-1));
    }

    public void addEdge(int v, int w) {
        validateVertex(v);
        validateVertex(w);
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    public int degree(int v) {
        validateVertex(v);
        return adj[v].size();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        In in  = new In(args[0]);
        Graph g = new Graph(in);
        StdOut.println(g);
    }
}
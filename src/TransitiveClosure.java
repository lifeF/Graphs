public class TransitiveClosure
{
    private DirectedDFS[] all;
    TransitiveClosure(DiGraph G)
    {
        all = new DirectedDFS[G.V()];
        for (int v = 0; v < G.V(); v++)
            all[v] = new DirectedDFS(G, v);
    }
    boolean reachable(int v, int w)
    {  return all[v].marked(w);  }
}

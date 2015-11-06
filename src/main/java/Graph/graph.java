package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
	private int V;
	private LinkedList<Integer> adj[];
	graph(int v){
		V=v;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i]=new LinkedList<Integer>();
	}
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	void BFS(int s){
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList();
		q.add(s);
		visited[s] = true;
		while(!q.isEmpty()){
			int temp = q.peek();
			System.out.println(temp+"->");
			Iterator<Integer> i = adj[temp].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n]=true;
					q.add(n);
				}
			}	
		}
	}
	void DFS(int s){
		boolean[] visited = new boolean[V];
		DFSUtil(s,visited);
	}
	void DFSUtil(int s, boolean[] visited){
		visited[s]=true;
		System.out.println(s+"->");
		Iterator<Integer> i = adj[s].listIterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n])
				DFSUtil(n,visited);
		}
	}
}

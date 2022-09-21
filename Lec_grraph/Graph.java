package Lec_grraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
//HashMap<V1,V1_Nbr> map
//	HashMap<Integer,HashMap<V2,Wt>> map

	HashMap<Integer, HashMap<Integer, Integer>> map;

	Graph(int totalV) {
		map = new HashMap<>();
		for (int i = 1; i <= totalV; i++) {
			map.put(i, new HashMap<>());
		}
	}

	Graph() {
		this(7);
	}

	public void addEdge(int V1, int V2, int Wt) {
		HashMap<Integer, Integer> V1_Nbr = map.get(V1);
		V1_Nbr.put(V2, Wt);

		HashMap<Integer, Integer> V2_Nbr = map.get(V2);
		V2_Nbr.put(V1, Wt);

	}

	public boolean isNbr(int V1, int V2) {
		return map.get(V1).containsKey(V2);
	}

	public int getWt(int V1, int V2) {
		return map.get(V1).get(V2);
	}

	public void removeEdge(int V1, int V2) {
		HashMap<Integer, Integer> V1_Nbr = map.get(V1);
		V1_Nbr.remove(V2);

		HashMap<Integer, Integer> V2_Nbr = map.get(V2);
		V2_Nbr.remove(V2);
	}

	public int numEdges() {
		int ans = 0;
		for (int V : map.keySet()) {
			HashMap<Integer, Integer> V_Nbr = map.get(V);
//			for (int Nbr : V_Nbr.keySet()) {
//				ans = ans + 1;
//			}
			ans = ans + V_Nbr.size();
		}
		return ans / 2;
	}

	public boolean hasPath(int src, int Dest) {
		return hasPath(src, Dest, new HashSet<>(),"");
	}
	private boolean hasPath(int curr, int Dest, HashSet<Integer> Visited,String path) {
		if (curr == Dest) {
			System.out.println(path);
			return true;
		}
//		BP  curr to Deest?
		Visited.add(curr);
	
		boolean ans = false;
		for (int Nbr : map.get(curr).keySet()) {
			if (!Visited.contains(Nbr)) {
				boolean sp = hasPath(Nbr, Dest, Visited,path+" "+Nbr);
				ans = ans || sp;
			}
		}
		Visited.remove(curr);
		return ans;
	}
	public void BFS(int src) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		HashSet<Integer>Visited = new HashSet<>();
		while(!Q.isEmpty()){
			int curr = Q.poll();
			if(Visited.contains(curr)) {
				System.out.println("CYCKLE!!! hein");
				continue;
			}
			System.out.println(curr);
			Visited.add(curr);
			for(int nbr : map.get(curr).keySet()) {
				if(!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}
}

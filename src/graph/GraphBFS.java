package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class GraphBFS {

	public static boolean[] visited;

	public static void main(String[] args) {
		// ノード数(最大ノード番号)
		int N = 6;

		// グラフを初期化
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < N + 1; i++) {
			List<Integer> tmpList = new ArrayList<Integer>();
			graph.add(tmpList);
		}

		// グラフに要素を追加
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(2).add(3);
		graph.get(2).add(5);
		graph.get(3).add(1);
		graph.get(3).add(2);
		graph.get(3).add(4);
		graph.get(4).add(3);
		graph.get(4).add(6);
		graph.get(5).add(2);
		graph.get(5).add(6);
		graph.get(6).add(4);
		graph.get(6).add(5);

		// 訪問管理を初期化
		visited = new boolean[N + 1];
		for (int i = 0; i < N + 1; i++) {
			visited[i] = false;
		}

		Deque<Integer> que = new ArrayDeque<Integer>();

		int root = 1;
		// bfs
		// ルートから探索開始
		visited[root] = true;
		que.add(root);

		while (!que.isEmpty()) {
			// 先頭を取り出す
			int v = que.poll();
			// 訪問済み
			visited[v] = true;
			System.out.println(v);

			for (int nextV : graph.get(v)) {
				// 訪問済みなら飛ばす
				if (visited[nextV]) {
					continue;
				}
				// 既に存在する場合は加えない
				if (!que.contains(nextV)) {
					// キューに追加
					que.add(nextV);
				}
			}
		}
	}

}

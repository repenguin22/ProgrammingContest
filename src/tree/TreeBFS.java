package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeBFS {

	public static boolean[] visited;

	public static void main(String[] args) {
		// ノード数(最大ノード番号)
		int N = 7;

		// 木を初期化
		List<List<Integer>> tree = new ArrayList<List<Integer>>();
		for (int i = 0; i < N + 1; i++) {
			List<Integer> tmpList = new ArrayList<Integer>();
			tree.add(tmpList);
		}

		// 木に要素を追加
		tree.get(4).add(2);
		tree.get(4).add(5);
		tree.get(2).add(1);
		tree.get(2).add(3);
		tree.get(5).add(6);
		tree.get(5).add(7);

		// 訪問管理を初期化
		visited = new boolean[N + 1];
		for (int i = 0; i < N + 1; i++) {
			visited[i] = false;
		}

		Deque<Integer> que = new ArrayDeque<Integer>();

		int root = 4;
		// bfs
		// ルートから探索開始
		visited[root] = true;
		que.add(root);

		while (!que.isEmpty()) {
			// 先頭を取り出す
			int v = que.poll();
			System.out.println(v);

			for (int nextV : tree.get(v)) {
				// 訪問済みなら飛ばす
				if (visited[nextV]) {
					continue;
				}
				// キューに追加
				que.add(nextV);
			}
		}
	}

}

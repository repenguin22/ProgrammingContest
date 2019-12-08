package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeDFS {

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

		// dfs
		dfs(tree, 4);
	}

	/**
	 * 深さ優先探索
	 * @param tree 木
	 * @param v ノードのインデックス 開始インデックスはroot
	 */
	public static void dfs(List<List<Integer>> tree, int v) {
		System.out.println(v);
		visited[v] = true;
		for (int node : tree.get(v)) {
			if (visited[node]) {
				continue;
			}
			dfs(tree, node);
		}
		return;
	}

}

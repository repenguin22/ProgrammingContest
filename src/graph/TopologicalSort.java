package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

	public static boolean[] visited;
	public static Stack<Integer> stackForSorted;

	public static void main(String[] args) {
		// ノード数(最大ノード番号)
		int N = 8;

		// グラフを初期化
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < N + 1; i++) {
			List<Integer> tmpList = new ArrayList<Integer>();
			graph.add(tmpList);
		}

		// グラフに要素を追加
		graph.get(1).add(3);
		graph.get(2).add(3);
		graph.get(2).add(4);
		graph.get(3).add(5);
		graph.get(4).add(6);
		graph.get(5).add(6);
		graph.get(5).add(8);
		graph.get(6).add(7);

		// 訪問管理を初期化
		visited = new boolean[N + 1];
		for (int i = 0; i < N + 1; i++) {
			visited[i] = false;
		}

		// ソート結果を格納するスタックを初期化
		stackForSorted = new Stack<Integer>();

		System.out.println("探索開始：");
		// 全ノード繰り返す
		for (int i = 1; i < N; i++) {
			if (!visited[i]) {
				dfs(graph, i);
			}
		}

		// 結果を出力する
		System.out.println("結果：");
		while (!stackForSorted.isEmpty()) {
			System.out.println(stackForSorted.pop());
		}
	}

	/**
	 * 深さ優先探索
	 * @param graph グラフ
	 * @param v ノードのインデックス 開始インデックスはroot
	 */
	public static void dfs(List<List<Integer>> graph, int v) {
		System.out.println(v);
		for (int node : graph.get(v)) {
			if (visited[node]) {
				continue;
			}
			dfs(graph, node);
		}
		visited[v] = true;
		stackForSorted.push(v);
		return;
	}

}

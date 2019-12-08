package search;

import java.util.ArrayList;
import java.util.List;

public class BitBruteForceSearch {

	/**
	 * 部分集合問題
	 * bit全探索
	 * {a,b,c} => { },{a},{b},{c},{a,b},{a,c},{b,c},{a,b,c}
	 */
	public static void main(String[] args) {

		String[] c = { "a", "b", "c" };
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < 1 << c.length; i++) {
			ArrayList<String> temp = new ArrayList<String>();
			for (int j = 0; j < c.length; j++) {
				if ((i >> j & 1) == 1) {
					temp.add(c[j]);
				}
			}
			list.add(temp);
		}

		// 出力サンプル
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + ":");
			for (String data : list.get(i)) {
				System.out.print(data + ",");
			}
			System.out.println("");
		}

	}

}

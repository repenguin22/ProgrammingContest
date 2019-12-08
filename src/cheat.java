import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class cheat {

	static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for文
		int n = 1;
		for (int i = 0; i < n; i++) {

		}

		for (int i = 0; i < n; i++) {
			int[] temp = new int[2];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			//G[i] = temp;
		}

		// 二次元配列に分解
		/*for (int i = 0; i < N; i++) {
			String str = sc.next();
			String[] temp = new String[N];
			for (int j = 0; j < N; j++) {
				temp[j] = String.valueOf(str.charAt(j));
			}
			ary[i]=temp;
		}*/

		//絶対値
		//Math.abs();

		// 出力
		System.out.println("");
		// 階乗の中であまりを出すこと long型を超えて不正解になるケースがある
		/*for (int i = 0; i < N / 2; i++) {
			ret *= 2;
			ret %= 1000000007;
		}*/

		// 配列の比較
		int[] c = new int[2];
		int[] d = new int[2];
		boolean cd = Arrays.equals(c, d);

		// list
		List<String> list = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();

		// ソート 昇順
		Collections.sort(list);
		// ソート 降順
		Collections.reverse(list);

		int[] intAry = new int[1];
		// 昇順のみ
		Arrays.sort(intAry);

		//hashset
		Set<String> set = new HashSet<String>();
		set.add("");
		set.contains("");
		set.size();
		// 和集合 元のが消えるので注意
		set.retainAll(set);
		//出力
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
		}

		// map
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> linkedMap = new LinkedHashMap<String, Integer>();
		//格納
		/*for (int i = 0; i < ; i++) {
			if (map.containsKey()) {
				map.put(, map.get() + 1);
			} else {
				map.put(, 1);
			}
		}*/

		// キーでソート
		map.entrySet().stream().sorted(Entry.comparingByKey());
		// キーでソート降順
		map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey()));
		// 値でソート
		map.entrySet().stream().sorted(Entry.comparingByValue());
		// 値でソート降順
		map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue()));

		//クラスをソート
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("a", 1));
		personList.add(new Person("b", 2));
		personList.sort((a, b) -> a.age - b.age);
		// 逆
		personList.sort((a, b) -> b.age - a.age);
		// 配列の場合
		//Arrays.sort( arr, (a,b)-> a.age - b.age );

		//出力
		Iterator<Map.Entry<String, Integer>> itr2 = map.entrySet().iterator();
		while (itr2.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr2.next();
			String str = entry.getKey();
			int i = entry.getValue();
		}

	}

	public static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static int wordSearch(char c) {
		for (int i = 0; i < alphabet.length; i++) {
			if (c == alphabet[i]) {
				return i;
			}
		}
		return -1;
	}

}

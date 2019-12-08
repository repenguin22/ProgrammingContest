package str;

import java.util.ArrayList;
import java.util.List;

public class RunLength {
	public static void main(String[] args) {
		List<String[]> list = getRunLength("aaaccc");
		System.out.println("a");
	}

	public static List<String[]> getRunLength(String str) {
		List<String[]> list = new ArrayList<String[]>();
		char back = 'm';
		for (int i = 0; i < str.length(); i++) {
			if (back != str.charAt(i)) {
				String[] hairetu = new String[2];
				hairetu[0] = String.valueOf(str.charAt(i));
				hairetu[1] = "1";
				list.add(hairetu);
				back = str.charAt(i);
			} else {
				String[] hairetu = list.get(list.size() - 1);
				hairetu[1] = String.valueOf(Integer.parseInt(hairetu[1]) + 1);
				list.set(list.size() - 1, hairetu);
			}
		}
		return list;
	}
}

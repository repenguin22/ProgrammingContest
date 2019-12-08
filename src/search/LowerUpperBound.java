package search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 非推奨！！
 * @author devSo
 *
 */
public class LowerUpperBound {

	public static void main(String[] args) {

	}

	public static int LowerBoundAry(int[] ary, int target) {
		int result = Arrays.binarySearch(ary, (int) (target - 0.1));
		int insertionPoint = (result >= 0) ? result : ~result;
		return insertionPoint;
	}

	public static int UpperBoundAry(int[] ary, int target) {
		int result = Arrays.binarySearch(ary, (int) (target + 0.1));
		int insertionPoint = (result >= 0) ? result : ~result;
		return insertionPoint;
	}

	public static int LowerBoundCollection(List<Integer> ary, int target) {
		int result = Collections.binarySearch(ary, target, new LowerBoundComparator<>());
		int insertionPoint = (result >= 0) ? result : ~result;
		return insertionPoint;
	}

	public static class LowerBoundComparator<T extends Comparable<? super T>>
			implements Comparator<T> {
		public int compare(T x, T y) {
			return (x.compareTo(y) >= 0) ? 1 : -1;
		}
	}

	public static int UpperBoundCollection(List<Integer> ary, int target) {
		int result = Collections.binarySearch(ary, target, new UpperBoundComparator<>());
		int insertionPoint = (result >= 0) ? result : ~result;
		return insertionPoint;
	}

	public static class UpperBoundComparator<T extends Comparable<? super T>>
			implements Comparator<T> {
		public int compare(T x, T y) {
			return (x.compareTo(y) > 0) ? 1 : -1;
		}
	}
}

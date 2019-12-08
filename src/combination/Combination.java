package combination;

public class Combination {

	public static void main(String[] args) {
		// 前処理
		// Nは全個数の数
		int N = 5;
		COMinit(N + 1);

		// 計算例
		long ret = COM(5, 3);
		System.out.println(ret);
	}

	static int MOD = 1000000007;

	static long[] fac;
	static long[] finv;
	static long[] inv;

	// テーブルを作る前処理
	static void COMinit(int N) {
		fac = new long[N];
		finv = new long[N];
		inv = new long[N];
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for (int i = 2; i < N; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	// 二項係数計算
	static long COM(int n, int k) {
		if (n < k)
			return 0;
		if (n < 0 || k < 0)
			return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

}

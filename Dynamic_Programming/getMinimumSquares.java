package DynamicProgramming;

public class getMinimumSquares {
	public static int dpGetMinSqr(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1; // 1 * 1
		dp[2] = 2; // 1 * 1 + 1 * 1
		dp[3] = 3; // 1 * 1 + 1 * 1 + 1 * 1

		for (int i = 4; i <= n; i++) {
			dp[i] = i;
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
			}
		}

		return dp[n];

	}

	public static void main(String[] args) {
		System.out.println(dpGetMinSqr(1365));
	}

}

class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] dp = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (rating[i] > rating[j]) {
                    c++;
                    res += dp[j];
                }
            }
            dp[i] = c;
        }
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (rating[i] < rating[j]) {
                    c++;
                    res += dp[j];
                }
            }
            dp[i] = c;
        }
        return res;
    }
}
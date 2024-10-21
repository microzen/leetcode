/*
1497. Check if Array Pairs are Divisible by K
 */
public class ArrayParirsDivisible {
    public boolean canArrange(int[] arr, int k) {
        boolean[] dp = new boolean[arr.length];
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            if(dp[i])continue;
            for (int j = 0; j < arr.length; j++) {
                if (i == j || dp[j]) continue;
                if ((arr[i] + arr[j]) % k == 0) {
                    flag = true;
                    dp[i] = true;
                    dp[j] = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}

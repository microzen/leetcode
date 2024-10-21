/*
1590. Make Sum Divisible by P
https://leetcode.com/problems/make-sum-divisible-by-p/description/?envType=daily-question&envId=2024-10-03
 */
public class LC1590_SumDivisible {
    public int minSubarray(int[] nums, int p) {
        int smallest = Integer.MAX_VALUE;
        int[] prefixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i] + nums[i];
        }
        if (prefixSum[nums.length - 1] % p == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
//            #TODO
//            if((sum-nums[i]) % p == 0){
//                smallest = Math.min(smallest, i);
//            }
        }
        return smallest;
    }
}

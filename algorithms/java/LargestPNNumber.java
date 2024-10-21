import java.util.HashMap;
import java.util.Set;

public class LargestPNNumber{
    public int findMaxK(int[] nums) {
        int result = -1;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num : nums){
            boolean isPositive = num > 0;
            int n = Math.abs(num);
            if(map.containsKey(n)){
                if(map.get(n) != isPositive){
                    result = Math.max(result,n);
                }
            }else {
                map.put(n,isPositive);
            }
        }
        Set<Integer> set = map.keySet();
        return result;
    }
}

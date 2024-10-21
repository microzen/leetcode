/*
4. Longest Substring without Repeating Character
 */

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstr {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                count++;
                set.add(s.charAt(i));
            }else{
                max = Math.max(max,count);
                count = 1;
            }
        }
        return max;
    }
}

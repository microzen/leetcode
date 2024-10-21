import java.util.Arrays;
import java.util.HashMap;
/*
1331. Rank Transform of an Array
https://leetcode.com/problems/rank-transform-of-an-array/description/
 */
public class RankTransform {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        int[] array = arr.clone();
        Arrays.sort(array);
        int rank = 1;
        for (int i = 0; i < array.length; i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i], rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            array[i] = map.get(arr[i]);
        }
        return array;
    }
    int[] shellSort(int[] arr, int start, int end) {
        if(start >= end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        int[] left = shellSort(arr, start, mid);
        int[] right = shellSort(arr, mid + 1, end);
//        #TODO quick sort
        return arr;
    }
}

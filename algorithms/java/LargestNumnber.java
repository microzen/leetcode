public class LargestNumnber {
    public String largestNumber(int[] nums) {
        sort(nums, 0, nums.length - 1);
        int counter = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            counter += nums[i];
        }
        if(counter == 0){
            return "0";
        }else{
            return sb.toString();
        }
    }
    void sort(int[] nums,int low,int high) {
        if(low >= high) {
            return;
        }
        int index = partition(nums,low,high);
        sort(nums,low,index-1);
        sort(nums,index+1,high);
    }
    int partition(int[] nums, int low, int high) {
        int pivot = low;
        while (low < high) {
            if(isGoBehind(nums[pivot], nums[low])) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;

            }else{
                low++;
            }
        }
        if(isGoBehind(nums[pivot],nums[low])) {
            low--;
        }
        int temp = nums[pivot];
        nums[pivot] = nums[low];
        nums[low] = temp;

        return low;
    }
    boolean isGoBehind(int a, int b) {
        boolean result = false;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb1.append(b).append(a);
        sb2.append(a).append(b);
        return sb1.compareTo(sb2) < 0;
    }
}

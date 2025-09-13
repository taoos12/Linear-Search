public class SearchInRangeInt {
    public static void main(String[] args) {
        int[] nums = {92, 43, 1, 99, 21, 0, 67};
        int target = 1;
        System.out.println(linearSearchInRange(nums, target, 2, 5));
    }   
    
    public static int linearSearchInRange(int[] nums, int target, int start, int end){
        if(nums.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}

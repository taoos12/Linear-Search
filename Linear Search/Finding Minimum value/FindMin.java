public class FindMin {
    public static void main(String[] args) {
        int[] nums = {92, 4, -89, 1, 29, 34};
        System.out.println(min(nums));
    }

    // Assume arr.length != 0
    // return the minimum value in the array
    public static int min(int[] nums){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}

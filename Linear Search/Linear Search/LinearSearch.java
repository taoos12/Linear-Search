public class Main{
    public static void main(String[] args){
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        if (ans == -1){
            System.out.println("Element "+ target +" not found");
        }
        else{
            System.out.println("Element "+ target +" found at index: "+ ans);
        }
    }

    // Search in the array: return the index if item found 
    // otherwise if item not found return -1
    public static int linearSearch(int[] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        // run a for loop
        for(int index = 0; index < nums.length; index++){
            // Check for element at every index if it is = target
            if(nums[index] == target){
                return index;
            }
        }
       
        // This line will executed if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
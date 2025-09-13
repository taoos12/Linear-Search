import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums= {
                {8, 5, 2},
                {1, 9 ,4, 0},
                {6, 3, 7}
        };
        int target = 3;
        int[] ans = search2D(nums, target); // format of return value {row, col}
        System.out.print(Arrays.toString(ans));
    }   
    
    public static int[] search2D(int[][] nums, int target){
        
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < row; col++) {
                if(nums[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

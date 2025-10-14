import java.util.*;

class cyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,5,0,2,1,4};
        cycleSort(nums);
        System.out.print(Arrays.toString(nums));
    }
    
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
    }
}

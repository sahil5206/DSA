import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.print(linearSearch(arr, 5));
    }
    
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

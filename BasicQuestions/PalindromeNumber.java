import java.util.*;

class PalindromeNumber {
    public static void main(String[] args) {
        int r, temp, sum = 0;
        int n = 292; 
        
        temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        
        if(sum == temp){
            System.out.print("this is a plaindrome number");
        }else{
            System.out.print("this is not a plaindrome number");
        }
    }
}

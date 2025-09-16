import java.util.*;

class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 157;
        int r, temp, sum = 0;
        
        temp = n;
        while(n > 0){
            r = n % 10;
            sum = sum + (r*r*r);
            n = n / 10;
        }
        
        if(temp == sum){
            System.out.print("this is an armstrong number");
        }else{
            System.out.print("this is not an armstrong number");
        }
    }
}

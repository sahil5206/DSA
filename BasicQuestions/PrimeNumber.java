import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count < 2){
            System.out.print("this is a prime number");
        }else{
            System.out.print("this is not a prime number");
        }
    }
}

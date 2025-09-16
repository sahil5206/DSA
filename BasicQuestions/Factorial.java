import java.util.*;

class Factorial {
    public static void main(String[] args) {
        int n = 10;
        
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        
        System.out.print(factorial);
    }
}

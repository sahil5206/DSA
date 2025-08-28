import java.util.*;

class HashSetPractice{
    public static void main(String[] args){
        
        //Making HashSet
        HashSet<Integer> set = new HashSet<>();
        
        //insert
        set.add(1);
        set.add(12);
        set.add(3);
        set.add(4);
        
        //print complete set
        System.out.println(set);
        
        
        //delete elements
        set.remove(12);
        System.out.println(set);
        
        //searching in HashSet using teh contains() function
        if(set.contains(3)){
            System.out.println("yes it contains");
        }else{
            System.out.println("No it doesn't contains");
        }
        
        //Iterator in HashSet and using next() & hasNext() functions
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


//------------------------------------------------------------------------------------------------------------------------------
//A different and little advance approach for the above funtions
import java.util.*;

class HashSetParctice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        
        //inserting elements using a loop from the array
        int[] arr = {2,4,5,7,6,9};
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        
        //printing the complete set
        System.out.println(set);
        
        //taking input from the user for deleting the element from the set
        System.out.print("enter the item you want to delete: ");
        int delete = sc.nextInt();
        if(set.contains(delete)){
            set.remove(delete);
        }else{
            System.out.println("this number is not in the set");
        }
        System.out.println(set);
        
        //Size of the set
        System.out.println("the size of the set is: " + set.size());
        
        //Iteration
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

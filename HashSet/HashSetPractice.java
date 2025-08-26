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

import java.util.*;

class HashMapPractice {
    public static void main(String[] args){
        
        //making a HashMap of String tyoe of key and Integer type of key
        HashMap<String, Integer> map = new HashMap<>();
        
        //inserting
        map.put("sahil", 100);
        map.put("danish", 0);
        map.put("harsh", -10);
        map.put("gaurav", 25);
        map.put("sumit", 40);
        
        //printing complete HashMap
        System.out.println(map);
        
        //Deleting a pair from HashMap (just pass the key in the below function)
        map.remove("gaurav");
        System.out.println(map);
        
        
        
        
    }
}

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
        
        //updating a value of the specific key
        map.put("sumit", 45);
        System.out.println(map);
        
        //searching/lookup in HashMap
        if(map.containsKey("sahil")){
            System.out.println("yes it contains sahil");
        }else{
            System.out.println("no it does not contains sahil");
        }
        
        //to get the value of a key
        System.out.println(map.get("harsh"));
        
        //Iteration in HashMap
        for(Map.Entry<String, Integer>e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        
    }
}

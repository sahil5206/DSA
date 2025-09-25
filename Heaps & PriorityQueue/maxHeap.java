import java.util.*;

class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> m = new PriorityQueue<>(Collections.reverseOrder());
        
        m.add(45);
        m.add(44);
        m.add(40);
        m.remove(45);
        System.out.println(m.size());
        
        
        while(!m.isEmpty()){
            System.out.println(m.poll());
        }
    }
}

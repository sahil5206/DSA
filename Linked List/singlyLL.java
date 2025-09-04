import java.util.*;

class LL {
    static class Node{
        public int data;
        public Node next;
        
        public Node(int data){
        this.data = data;
        this.next = null;
        }
    
    public void setData(int data){
        this.data = data;
    }
    
    public int getData(){
        return data;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node getNext(){
        return this.next;
        
    }
}
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node current = head;
        
        for(int i = 1; i < arr.length; i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }
        
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
}

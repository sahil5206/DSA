import java.util.*;

class LL {
    
    static class Node{
        private int data;
        private Node next;
        private Node prev;
        
        private Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
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
        
        public void setPrev(Node prev){
            this.prev = prev;
        }
        
        public Node getPrev(){
            return this.prev;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node current = head;
        
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
            
        }
        
        Node temp = head;
        Node tail = null;
        System.out.print("forward traversal: ");
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            if(temp.next == null){
                tail = temp;
            }
            temp = temp.next;
        }
        System.out.println("null");
        
        System.out.print("backward traversal: ");
        while(tail != null){
            System.out.print(tail.data + " <-> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }
    
}

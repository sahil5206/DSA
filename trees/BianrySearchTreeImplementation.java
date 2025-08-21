import java.util.*;

class BST{
    static class Node{
        public int data;
        public Node left, right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            root.left = insert(root.left, val);
        }else if(root.data < val){
            root.right = insert(root.right, val);
        }
        return root;
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{ //root.data == val
        //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            
            //case 3
            Node successor = inorderSuccessor(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }else if(root.data >= y){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }
    
    public static void main(String[] args){
        int[] values = {3,1,4,2,5,7};
        Node root = null;
        
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root,7);
        inorder(root);
        System.out.println();
        printInRange(root, 2, 5);
    }
}

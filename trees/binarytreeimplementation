import java.util.*;

//sequential(array) representation of binary tree. and linked representation is the manual method to create all the nodes(objects) by making the class and functions.....
class BinaryTreePractice {
    static class Node{
        public int data;
        public Node left, right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.left.right.data);
        System.out.print(height(root));
    }

//calculating height of the tree by making the fucntion
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        
        int leftside = height(root.left);
        int rightside = height(root.right);
      
        return Math.max(leftside, rightside) + 1;
    }
}

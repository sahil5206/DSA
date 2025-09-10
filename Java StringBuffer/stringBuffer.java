import java.util.*;

//StringBuffer is mutable in java (but Strings are immutable).
//StringBuffer is Thread-Safe in java.
//StringBuffer is usually slower in terms of time complexity beacause of its Thread-Safe condition becasue threads waits for locks.

class StringBufferPractice {
    public static void main(String[] args) {
        
        //creating first object of stringBuffer class provided by java
        StringBuffer sb1 = new StringBuffer();
        
        //inserting and appending String or character in StringBuffer
        sb1.append("sahil");
        sb1.append(" gupta");
        
        //insert a String or character at a particular index
        sb1.insert(2, " ji ");
        
        //deleting a part of String within particular indexes
        sb1.delete(2, 6);
        
        //replacing a sub-string in particular indexed with another String
        sb1.replace(6, 11, "singla");
        
        //printing the first object
        System.out.println(sb1);
        
        //capacity of StringBuffer (16 is default)
        System.out.println(sb1.capacity());
        
        //length of the string we have entered till now
        System.out.println(sb1.length());
        
        //printing the starting index of the entered String
        System.out.println(sb1.indexOf("singla"));
        
        
        //made the second object with a deault String given in the constructor
        StringBuffer sb2 = new StringBuffer("sahil gupta");
        System.out.println(sb2);
        
        //the length of sb2 will be the length of the String entered in the constructor
        System.out.println(sb2.length());
        
        
        //made the third object with capacity of 30 (by default is 16 in java)
        StringBuffer sb3 = new StringBuffer(30);
        
        //it will print 30 as the capacity of the object named sb3 because we entered teh custom capacity in the constructor
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        
    }
}

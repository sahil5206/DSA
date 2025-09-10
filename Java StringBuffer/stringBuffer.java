import java.util.*;

class Main {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("sahil");
        sb1.append(" gupta");
        sb1.insert(2, " ji ");
        sb1.delete(2, 6);
        sb1.replace(6, 11, "singla");
        
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1.indexOf("singla"));
        
        
        StringBuffer sb2 = new StringBuffer("sahil gupta");
        System.out.println(sb2);
        System.out.println(sb2.length());
        
        
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        
    }
}

public class Lab12_2 {
public static void main(String[] args) {
    String str = "w3resource.com";
        
        System.out.println("Original String : " + str);
        
        int val1 = str.codePointAt(1);
    
        int val2 = str.codePointAt(9);
        
        System.out.println("Character(unicode point) = " + val1);
        
        System.out.println("Character(unicode point) = " + val2);
}
}

public class Lab12_3 {
public static void main(String[] args) {
    String str = "w3resource.com";
        
        System.out.println("Original String : " + str);
        
        int val1 = str.codePointBefore(1);
    
        int val2 = str.codePointBefore(9);
        
        System.out.println("Character(unicode point) = " + val1);

        System.out.println("Character(unicode point) = " + val2);
}
}

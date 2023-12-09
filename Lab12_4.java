public class Lab12_4 {
public static void main(String[] args) {
    String str = "w3rsource.com";
       
        System.out.println("Original String : " + str);
        
        int ctr = str.codePointCount(1, 10);
        
        System.out.println("Codepoint count = " + ctr);
}
}

public class Lab12_41 {
public static void main(String[] args) {
    String str1 = "the quick brown fox";
    String str2 = "queen";
    
    System.out.println("The given string is: " + str1);
    System.out.println("The given mask string is: " + str2);
    
    char arr[] = new char[str1.length()];
    
    char[] mask = new char[256];
    
    for (int i = 0; i < str2.length(); i++)
        mask[str2.charAt(i)]++;
    
    System.out.println("\nThe new string is: ");
    
    for (int i = 0; i < str1.length(); i++) {
     
        if (mask[str1.charAt(i)] == 0)
            System.out.print(str1.charAt(i));
    }
}
}

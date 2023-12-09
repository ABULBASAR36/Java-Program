public class Lab12_5 {
public static void main(String[] args) {
    String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";
        
        System.out.println("String 1: " + str1);
      
        System.out.println("String 2: " + str2); 
       
        int result = str1.compareTo(str2);

        if (result < 0)
         {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0) 
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        } 
        else 
        { 
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
}
}

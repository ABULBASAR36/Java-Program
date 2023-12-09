import java.util.Arrays;

public class Lab12_48 {
   public static void main(String[] args) {

        String strg = "abrambabasc";
        System.out.println("The given string is: " + strg);
        System.out.print("After removing the specified characters, the new string is: ");
       
        removeSetofCharacters(strg, "ac", "b");
    }

    public static void removeSetofCharacters(String str, String ptn1, String ptn2) {
   
        int n = str.length(), i;
        int ptr = 0;
        char[] arr1 = str.toCharArray();

        for (i = 0; i < n; ++i) {
    
            if (arr1[i] == 'b') {
                continue; 
            } else if (i + 1 < n && arr1[i] == 'a' && arr1[i + 1] == 'c') {
                ++i;
            } else {
                arr1[ptr++] = arr1[i]; 
            }
        }

        char[] ret = Arrays.copyOfRange(arr1, 0, ptr);
     
        System.out.println(new String(ret));
    }
}

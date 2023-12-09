public class Lab12_35 {
public static void main(String[] args) {
    permutationWithRepeation("PQR");
    }

    
    private static void permutationWithRepeation(String str1) {
    
        System.out.println("The given string is: PQR");
       
        System.out.println("The permuted strings are:");
       
        showPermutation(str1, "");
    }

    private static void showPermutation(String str1, String newStringToPrint) {
       
        if (newStringToPrint.length() == str1.length()) {
            System.out.println(newStringToPrint);
            return;
        }

        for (int i = 0; i < str1.length(); i++) {

            showPermutation(str1, newStringToPrint + str1.charAt(i));
        }
}
}

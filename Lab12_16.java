public class Lab12_16 {
public static void main(String[] args) {
    String str = "This is a sample String.";

    byte[] byte_arr = str.getBytes();

    String new_str = new String(byte_arr);

    System.out.println("\nThe new String equals " +
        new_str + "\n");
}
}

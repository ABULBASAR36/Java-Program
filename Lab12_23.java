public class Lab12_23 {
public static void main(String[] args) {
    String str1 = "Shanghai Houston Colorado Alexandria";
    String str2 = "Alexandria Colorado Houston Shanghai";

    boolean match1 = str1.regionMatches(0, str2, 28, 8);

    boolean match2 = str1.regionMatches(9, str2, 9, 8);

    System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
    System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
}
}

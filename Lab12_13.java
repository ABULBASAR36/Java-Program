public class Lab12_13 {
public static void main(String[] args) {
    String columnist1 = "Stephen Edwin King";
    String columnist2 = "Walter Winchell";
    String columnist3 = "Mike Royko";

    boolean equals1 = columnist1.equals(columnist2);
    
    boolean equals2 = columnist1.equals(columnist3);

    System.out.println("\"" + columnist1 + "\" equals \"" +
        columnist2 + "\"? " + equals1);
    System.out.println("\"" + columnist1 + "\" equals \"" +
        columnist3 + "\"? " + equals2);
}
}

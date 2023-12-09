public class Lab12_50 {
    public static int makefactorial(int n) {
        return (n <= 2) ? n : n * makefactorial(n - 1);
      }
    
      public static int calcuLexicoRank(String str, int n) {
        int ctrOfRank = 1;
        
        for (int i = 0; i < n; i++) {
          int ctr = 0;
          
          for (int j = i + 1; j <= n; j++) {
            if (str.charAt(i) > str.charAt(j))
              ctr++;
          }
          
          ctrOfRank += ctr * makefactorial(n - i);
        }
        return ctrOfRank; 
      }
      
      public static void main(String[] args) {
        String str = "BDCA";
        System.out.println("The Given String is: " + str);
        int n = str.length();
        System.out.print("The Lexicographic rank of the given string is: " + calcuLexicoRank(str, n - 1));
      }
}

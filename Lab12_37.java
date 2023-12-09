import java.util.LinkedHashMap;

public class Lab12_37 {
static void longestSubstring(String inputString) {
       
        char[] arr1 = inputString.toCharArray();

        String longestSubstring = "";
        int maxLength = 0;
    
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
    
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
          
            if (!charPosMap.containsKey(ch)) {
           
                charPosMap.put(ch, i);
            } else {
            
                i = charPosMap.get(ch);
            
                charPosMap.clear();
            }
          
            if (charPosMap.size() > maxLength) 
            {
                maxLength = charPosMap.size();
                longestSubstring = inputString.substring(i - maxLength + 1, i + 1);
            }
        }
        System.out.println("Input String: " + inputString);
        System.out.println("The longest substring: " + longestSubstring);
        System.out.println("The longest Substring Length: " + maxLength);
    }

    public static void main(String[] args) {
  
        longestSubstring("pickoutthelongestsubstring");
        longestSubstring("ppppppppppppp");
        longestSubstring("Microsoft");
    }
}

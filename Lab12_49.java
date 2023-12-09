import java.util.ArrayList;
import java.util.List;

public class Lab12_49 {
public static void main(String[] args) {
            int MXCHAR = 256;

        List inDLL = new ArrayList();

        boolean[] repeatyn = new boolean[MXCHAR];

        String chrstream = "godisgood";
        System.out.println("String: " + chrstream);

        for (int i = 0; i < chrstream.length(); i++) {

            char x = chrstream.charAt(i);
            System.out.println("Reading: " + x);

            if (!repeatyn[x]) {
                if (!(inDLL.contains(x))) {
                    inDLL.add(x); 
                } else {
                  
                    inDLL.remove((Character) x);
                    repeatyn[x] = true;
                }
            }

            if (inDLL.size() != 0) {
                System.out.print("The first non-repeating character so far is:  ");
                System.out.println(inDLL.get(0));
            }
        }
}
}

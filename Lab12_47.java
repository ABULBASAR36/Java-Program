public class Lab12_47 {
    public static int MX = 26;

    static class freqOfChar {
        char c;
        int f;

        public freqOfChar(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }

    public static void main(String[] args) {
        String strr = "accessories";
        System.out.println("The given string is: " + strr);
        System.out.println("The string after arranging newly is: ");
        String strg = charRearrange(strr, 4);
        if (strg != null)
            System.out.println(strg);
    }

    public static String charRearrange(String strg, int k) {
        if (strg.length() <= 1) return strg;

        freqOfChar[] chr_fre = new freqOfChar[MX];
        int ctr = 0;

        for (int i = 0; i < MX; i++) {
            chr_fre[i] = new freqOfChar((char)('a' + i), 0);
        }

        for (int i = 0; i < strg.length(); i++) {
            char ch = strg.charAt(i);
            chr_fre[ch - 'a'].f++;
            if (chr_fre[ch - 'a'].f == 1) ctr++;
        }

        bldOfHeap(chr_fre, MX);

        char[] str1 = new char[strg.length()];
        boolean[] occu = new boolean[strg.length()];

        for (int i = 0; i < ctr; i++) {
            freqOfChar chfreq = extractMax(chr_fre, MX - i);
            int ptr = i;
            while (occu[ptr]) ptr++;

            for (int j = 0; j < chfreq.f; j++) {
                if (ptr >= str1.length)
                    return null;
                str1[ptr] = chfreq.c;
                occu[ptr] = true;
                ptr += k;
            }
        }
        return new String(str1);
    }

    private static void bldOfHeap(freqOfChar[] chr_fre, int size) {
        int i = (size - 1) / 2;
        while (i >= 0) {
            maxHeapify(chr_fre, i, size);
            i--;
        }
    }

    private static void swap(freqOfChar cf1, freqOfChar cf2) {
        char c = cf1.c;
        int f = cf1.f;
        cf1.c = cf2.c;
        cf1.f = cf2.f;
        cf2.c = c;
        cf2.f = f;
    }

    private static void maxHeapify(freqOfChar[] chr_fre, int node, int size) {
        int l = node * 2 + 1;
        int r = node * 2 + 2;
        int largest = node;
        if (l < size && chr_fre[l].f > chr_fre[node].f) {
            largest = l;
        }
        if (r < size && chr_fre[r].f > chr_fre[largest].f) {
            largest = r;
        }
        if (largest != node) {
            swap(chr_fre[node], chr_fre[largest]);
            maxHeapify(chr_fre, largest, size);
        }
    }
    
    private static freqOfChar extractMax(freqOfChar[] chr_fre, int size) {
        freqOfChar max = chr_fre[0];
        chr_fre[0] = chr_fre[size - 1];
        chr_fre[size - 1] = null;
        maxHeapify(chr_fre, 0, size - 1);
        return max;
    }
}

class Solution {
    public String longestPalindrome(String S) {
        int start = 0, end = 1;
        for (int i = 1; i < S.length(); i++) {
            int l = i - 1;
            int h = i;
            while ((l >= 0 && h < S.length()) && (S.charAt(l) == S.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
            l = i - 1;
            h = i + 1;
            while ((l >= 0 && h < S.length()) && (S.charAt(l) == S.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
        }
        
        return S.substring(start, start + end);
    }
}

        

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int c = 0; c < t.length(); c++) {
            if (i < s.length() && t.charAt(c) == s.charAt(i)) 
                i++;
        }
        return i == s.length();
    }
}
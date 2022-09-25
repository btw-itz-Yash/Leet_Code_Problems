class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char ch;
        String nstr="";
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch + nstr; 
        }
        if(str.equals(nstr))
            return true;
        else
            return false;
    }
}
class Solution {
    public String replaceDigits(String s) {
        String nS="";
        for(int i=0;i<s.length();i++){
            if(i%2!=0){
            int ch = s.charAt(i);
            int ch1 = s.charAt(i-1);
            int n  = ch-48+ch1;
            char c = (char)n;
            nS=nS+c;
            }
            else
                nS=nS+s.charAt(i);
        }
        return nS;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)                            
            return false;
        int r = 0;            
        int c = x;
        while(c!=0){
            r = r*10+c%10;  
            c=c/10;
        }                                       
        
        return x==r;           
    }
}
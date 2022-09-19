class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int n = s.charAt(i)-96;
            if(n<10){
                sum+=n;
            }
            else{
                while(n!=0){
                    int digit = n%10;
                    sum+=digit;
                    n=n/10;
                }
            } 
        }
        if(k==1)
            return sum;
        else{
            while((k-1)!=0){
                int n1=sum;
                sum=0;
                while(n1!=0){
                    int ndigit = n1%10;
                    sum+=ndigit;
                    n1/=10;
                }
                k--;
            }
        }
        return sum;
    }
}
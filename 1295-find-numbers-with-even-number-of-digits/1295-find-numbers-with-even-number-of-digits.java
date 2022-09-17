class Solution {
    public int findNumbers(int[] nums) {
        int i=0;
        int ans=0;
        do{ 
            int n=nums[i];
            int count=0;
            while(n!=0){
                count++;
                n=n/10;
            }
            if(count%2==0){
                ans++;
            }
            i++;
            
        }while(i<nums.length);
        return ans;
    }
}
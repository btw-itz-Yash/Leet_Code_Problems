class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max=0;
        
        for(int i=0;i<n;i++){
            int mul=0;
            int j=0;
            while(j<n){
                if(i!=j && nums[i]*nums[j]>max){
                    mul = (nums[i]-1)*(nums[j]-1);
                    max = Integer.max(max,mul);
                }
                
                j++;
            }
        }
        return max;
    }
}
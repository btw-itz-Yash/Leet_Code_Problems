class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int [] target = new int[n];
        for(int i=0;i<n;i++){
            if(i<=index[i])
                target[index[i]] = nums[i];
            else{
                for(int j=i-1;j>=index[i];j--){
                    target[j+1]=target[j];
                }
                target[index[i]]=nums[i];
            }         
        }
        return target;
    }
}
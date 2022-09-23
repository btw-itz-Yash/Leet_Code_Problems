class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        while(ans>0){
            if(nums[0]%ans==0 && nums[nums.length-1]%ans==0)
                break;
            ans--;
        }
        return ans;
    }
}
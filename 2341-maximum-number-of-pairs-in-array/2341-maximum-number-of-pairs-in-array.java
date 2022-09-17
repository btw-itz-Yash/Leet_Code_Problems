class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                pair++;
                i++;
            }
        }
        return new int[] {pair,nums.length-pair*2};
    }
}
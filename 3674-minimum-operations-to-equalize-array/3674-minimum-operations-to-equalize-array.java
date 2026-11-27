class Solution {
    public int minOperations(int[] nums) {
        int first=nums[0];
        for(int i:nums){
            if(i!=first) return 1;
        }
        return 0;
    }
}
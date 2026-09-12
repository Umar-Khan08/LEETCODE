class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return sumlessthan(nums,goal)-sumlessthan(nums,goal-1);
    } private int sumlessthan(int [] nums,int goal)
    {
         if(goal<0) return 0;
        int l=0,r=0,cnt=0,sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum=sum-nums[l];
                l+=1;
            } cnt=cnt+(r-l+1);
            r++;
        } return cnt;
    }
}
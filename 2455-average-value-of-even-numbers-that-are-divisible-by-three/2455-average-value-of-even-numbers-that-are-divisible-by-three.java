class Solution {
    public int averageValue(int[] nums) {
        int c=0;int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0 && nums[i]%2==0)
            {
                sum=sum+nums[i];
                c++;
            }
        } if(c!=0)
        return sum/c;
        return 0;

        }
}
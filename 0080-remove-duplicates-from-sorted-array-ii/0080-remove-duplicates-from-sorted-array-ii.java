class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 0;
        for(int i = 0; i < nums.length; i++) 
        {
            if(ind < 2 || nums[i] != nums[ind - 2]) {// this means i am checking for the number in the index-2 element that if it is present there that means there are already two numbers so no need to add it {
                nums[ind] = nums[i];
                ind++;
            }
        }
        return ind;
    }
}

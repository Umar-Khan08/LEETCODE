class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
            if(freq[nums[i]]>1) li.add(nums[i]);
        } return li;
    }
}
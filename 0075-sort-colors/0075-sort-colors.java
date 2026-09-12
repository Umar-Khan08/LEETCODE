class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        int i=0;
        while(hm.getOrDefault(0,0)>0)
        {
            nums[i++]=0;
            hm.put(0,hm.get(0)-1);
        }
        while(hm.getOrDefault(1,0)>0)
        {
            nums[i++]=1;
            hm.put(1,hm.get(1)-1);
        }
        while(hm.getOrDefault(2,0)>0)
        {
            nums[i++]=2;
            hm.put(2,hm.get(2)-1);
        }
    }
}
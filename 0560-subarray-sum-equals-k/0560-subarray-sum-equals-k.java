class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int cnt=0;int n=nums.length;
        int s=0;
        hm.put(0,1);
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
            int remove=s-k;
            cnt+= hm.getOrDefault(remove, 0);
           hm.put(s,hm.getOrDefault(s,0)+1);
        } return cnt;
    }
}
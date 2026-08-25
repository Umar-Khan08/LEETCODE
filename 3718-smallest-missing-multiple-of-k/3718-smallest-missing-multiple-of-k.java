class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> li=new ArrayList<>();
        for(int i:nums)
        {
            li.add(i);
        } int m=k;
        while(li.contains(m))
        {
            m=m+k;
        } return m;
}
}
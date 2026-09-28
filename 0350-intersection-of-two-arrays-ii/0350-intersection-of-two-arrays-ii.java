class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0,right=0; ArrayList<Integer> li=new ArrayList<>();
        while(left<nums1.length && right<nums2.length)
        {
            if(nums1[left]<nums2[right]) left++;
            else if(nums1[left]>nums2[right]) right++;
            else {li.add(nums1[left]);left++;right++;}
        } int ans[]=new int[li.size()]; 
        for(int i=0;i<li.size();i++)
        {
            ans[i]=li.get(i);
        } return ans;
    }
}
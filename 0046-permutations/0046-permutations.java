class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> anslist, List<List<Integer>> ans) 
    {
        if (anslist.size() == nums.length) {
            ans.add(new ArrayList<>(anslist));
            return;
        }

        for (int num : nums) 
        {
            if (anslist.contains(num)) continue;
            anslist.add(num);
            backtrack(nums, anslist, ans);
            anslist.remove(anslist.size() - 1);
        }
    }
}
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), ans, used);
        return ans;
    }
    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> ans, boolean[] used) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }//adds the sublist to the anslist if the sublist size gets full
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;//if the element is used once we cannot take it so we continue
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;//this because if both hve ame value that means the numbers are duplicate but we have to take duplicates , and the last condition is for whihc the list doesnt get repeated due to the duplicate elements
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, temp, ans, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
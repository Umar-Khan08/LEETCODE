class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int n = nums.length;
        int[] sort = nums.clone();
        Arrays.sort(sort);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(sort[i])) {
                hm.put(sort[i], i);
            }
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = hm.get(nums[i]);
        }
        return ans;
    }
}
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int sum = 0;
        for (int num : nums) {
            if (freq[num] == 1) {
                sum += num;
                freq[num] = 0; 
            }
        }
        return sum;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;
        while (low < high) { // this checks the numbers in the array in the range 1 to n
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int num : nums) {
                if (num <= mid) { // checks how many numbers are less than mid
                    count++;
                }
            }
            if (count > mid) {// this means there are more than mid elemnts in the range 1 to mid that means the numbers are repeated in this
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
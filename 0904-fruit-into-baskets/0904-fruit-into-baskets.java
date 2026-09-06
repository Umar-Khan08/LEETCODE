class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r = 0, maxlen = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        while (r < fruits.length) {

            if (mp.containsKey(fruits[r])) {
                mp.put(fruits[r], mp.get(fruits[r]) + 1);
            } else {
                mp.put(fruits[r], 1);
            }

            while (mp.size() > 2) {

                mp.put(fruits[l], mp.get(fruits[l]) - 1);

                if (mp.get(fruits[l]) == 0) {
                    mp.remove(fruits[l]);
                }

                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);

            r++;
        }

        return maxlen;
    }
}
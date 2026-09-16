class Solution {
    public String largestGoodInteger(String num) {
        String[] sameDigitNums = {
            "999", "888", "777", "666", "555", 
            "444", "333", "222", "111", "000"
        };
        for (String target : sameDigitNums) {
            if (num.contains(target)) {
                return target;
            }
        }
        return "";
    }
}
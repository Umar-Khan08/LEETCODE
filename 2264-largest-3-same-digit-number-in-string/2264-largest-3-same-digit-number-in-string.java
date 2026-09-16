class Solution {
    public String largestGoodInteger(String num) {
        for(char c='9';c>='0';c--) {
            String s=""+c+c+c;
            if(num.contains(s))
                return s;
        }
        return "";
    }
}
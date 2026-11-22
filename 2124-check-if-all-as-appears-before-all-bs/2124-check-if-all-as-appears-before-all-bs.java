class Solution {
    public boolean checkString(String s) {
        int f=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'b') {
                f=1;
            } else if (f==1) { 
                return false;
            }
        }
        return true;
    }
}
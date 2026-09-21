import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String last = "";
        while (st.hasMoreTokens()) {
            last = st.nextToken();
        }
        return last.length();
    }
}
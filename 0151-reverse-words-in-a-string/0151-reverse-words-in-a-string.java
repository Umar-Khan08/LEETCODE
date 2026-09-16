import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        String ans = "";
        while(st.hasMoreTokens()) {
            ans = st.nextToken() + " " + ans;
        }
        return ans.trim();
    }
}
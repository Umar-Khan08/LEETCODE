import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) {
        StringTokenizer st=new StringTokenizer(s);int i=0;String res="";
        while(st.hasMoreTokens() && i<k)
        {
             res=res+st.nextToken()+" ";
             i++;
        } return res.trim();
    }
}
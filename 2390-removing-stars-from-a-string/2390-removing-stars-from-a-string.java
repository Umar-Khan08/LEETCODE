class Solution {
    public String removeStars(String s) {
        String result="";char ele;int pointer=0;
        Stack<Character> st=new Stack<>();
        while(pointer!=s.length())
        {   ele=s.charAt(pointer);
            if(ele=='*' && !st.empty())
            {
                st.pop();
            }else st.push(ele);
            pointer+=1;
            
        } for(int i=0;i<st.size();i++)
{
    result=result+st.get(i);
} return result;
    }
}
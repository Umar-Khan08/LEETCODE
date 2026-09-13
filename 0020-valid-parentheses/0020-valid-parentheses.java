class Solution {
    public boolean isValid(String str) {
         Stack<Character> st= new Stack<>();
         for(int i=0;i<str.length();i++)
         {
            char s=str.charAt(i);
            if(s=='(' || s=='[' || s=='{') st.push(s);
            else
            {
                if(st.isEmpty()) return false;
                char ch=st.peek();
                st.pop();
                if((ch == '(' && s == ')') ||
           (ch == '[' && s == ']') ||
           (ch == '{' && s == '}')) continue;
           else return false;
            }
         } return st.isEmpty();
    }
}
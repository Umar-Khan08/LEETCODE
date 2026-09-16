class Solution {
    public int calculate(String s) {
        int result=0,num=0,sign=1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) {
                num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))) {
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
            }
            else if(ch==' ') continue;
            else if(ch=='+') {
                result+=sign*num;
                num=0;
                sign=1;
            }
            else if(ch=='-') {
                result+=sign*num;
                num=0;
                sign=-1;
            }
            else if(ch=='(') {
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }
            else if(ch==')') {
                result+=sign*num;
                num=0;
                result*=st.pop();
                result+=st.pop();
            }
        }
        return result+sign*num;
    }
}
class Solution {
    public String removeStars(String s) {
        String result="";
    Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c == '*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        } for(int i=0;i<stack.size();i++)
{
    result=result+stack.get(i);
} return result;
    }
}
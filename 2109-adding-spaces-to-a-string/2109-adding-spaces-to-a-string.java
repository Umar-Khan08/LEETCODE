 class Solution {
    public String addSpaces(String s,int[] spaces) {
        int k=0;
        StringBuilder str=new StringBuilder();
        int t=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(t<spaces.length && spaces[t]==k){
                str.append(" ");
                t++;
            }
            str.append(ch);
            k++;
        }
        return str.toString();
    }
}
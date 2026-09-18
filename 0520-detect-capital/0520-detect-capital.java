class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch))
                c++;
        }
        return c==0||c==word.length()||c==1&&Character.isUpperCase(word.charAt(0));
    }
}
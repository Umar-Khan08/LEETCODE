class Solution {
    public boolean checkString(String s) {
    boolean ans=true;int f=0;
    for(int i=0;i<s.length();i++) 
    {
        char ch=s.charAt(i);
        if(ch=='b')
        {  int ptr=i+1;
        
            while(ptr<s.length())
            { char chh=s.charAt(ptr);
                if(chh=='a') {
                    ans=false;
                    break;
                } ptr++;
            }
        }
    } return ans;
    }
}
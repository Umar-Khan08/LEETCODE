class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> hs=new HashSet<>();int strength=0;
        for(char ch:password.toCharArray())
        {
            if(hs.contains(ch)) continue;
            else
            {   int charr=(int) ch;
                hs.add(ch);
                if(charr>=97 && charr<123) strength+=1;
                else if(charr>=65 && charr<=90) strength+=2;
                else if(charr>=48 && charr<58) strength+=3;
                else strength+=5;
            }          
        }     return strength;
    }
}
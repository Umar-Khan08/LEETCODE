class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<num.length();i++) {
            char ch=num.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++) {
            if(num.charAt(i)-'0'!=hm.getOrDefault((char)(i+'0'),0))
                return false;
        }
        return true;
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        StringBuilder ans=new StringBuilder();
        while(!map.isEmpty()){
            char max=' ';
            int freq=0;
            for(char ch:map.keySet()){
                if(map.get(ch)>freq){
                    max=ch;
                    freq=map.get(ch);
                }
            }
            for(int i=0;i<freq;i++)
                ans.append(max);
            map.remove(max);
        }
        return ans.toString();
    }
}
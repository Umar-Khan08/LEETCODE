class Solution {
    public int totalNumbers(int[] nums) {
        int freq[]=new int[10];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        } 
        int c=0;
        for(int h=1;h<10;h++)
        {
            for(int t=0;t<10;t++)
            {
                for(int o=0;o<10;o++)
                {
                    if(o%2!=0)
                        continue;
                    freq[o]--;
                    freq[h]--;
                    freq[t]--;
                    if(freq[o]>=0 && freq[t]>=0 && freq[h]>=0) c++;
                     freq[o]++;
                    freq[h]++;
                    freq[t]++;
                    
                }
            }
        } return c;
    }
}
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq[] = new int[10];

        for(int i=0;i<digits.length;i++)
        {
            freq[digits[i]]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int h=1;h<10;h++)
        {
            for(int t=0;t<10;t++)
            {
                for(int o=0;o<10;o++)
                {
                    if(o%2!=0)
                        continue;

                    freq[h]--;
                    freq[t]--;
                    freq[o]--;

                    if(freq[h]>=0 && freq[t]>=0 && freq[o]>=0)
                    {
                        ans.add(h*100+t*10+o);
                    }

                    freq[h]++;
                    freq[t]++;
                    freq[o]++;
                }
            }
        }

        int res[] = new int[ans.size()];

        for(int i=0;i<ans.size();i++)
        {
            res[i]=ans.get(i);
        }

        return res;
    }
}
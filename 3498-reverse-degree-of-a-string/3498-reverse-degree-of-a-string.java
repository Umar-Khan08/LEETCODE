class Solution {
    public int reverseDegree(String s) {
    int sum=0,i=1;
        for(char ch:s.toCharArray())
        {
            sum=sum+Math.abs(ch-123)*i;
            i++;
        } return sum;
    }
}
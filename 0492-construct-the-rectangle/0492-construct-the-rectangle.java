class Solution {
    public int[] constructRectangle(int area) {
        int w=(int)Math.sqrt(area);
        for(int i=w;i>=1;i--){
            if(area%i==0){
                int l=area/i;
                return new int[]{l,i};
            }
        }
        return new int[] {};
    }
}
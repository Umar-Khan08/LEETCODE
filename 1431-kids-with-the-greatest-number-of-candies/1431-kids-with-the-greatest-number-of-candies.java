class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> nl=new ArrayList<>();
        int maxCandies=0;
      for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=maxCandies) nl.add(true);
            else
            nl.add(false);
        } return nl;
    }
}
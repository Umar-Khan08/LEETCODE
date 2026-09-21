class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> st=new Stack<>();
       int max=0;
       int n=heights.length;
       for(int i=0;i<n;i++)
       {
        while(!st.isEmpty() && heights[st.peek()]>=heights[i])
        {
            int element=st.peek(); st.pop();
            int nse=i;
            int  pse = st.isEmpty() ? -1 : st.peek();
            max=Math.max(heights[element]*(nse-pse-1) , max);
        } st.push(i);
       } while(!st.isEmpty())
       {
        int nse=n;
        int element=st.peek();st.pop();
        int pse=st.isEmpty()? -1 : st.peek();
        max=Math.max(heights[element]*(nse-pse-1) , max);
       } return max;
    }
}

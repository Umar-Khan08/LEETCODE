class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> st=new Stack<>();
        st.push(Integer.parseInt(operations[0]));
        int sum=st.peek(),i=1;
        while(i<n)
        {   String key=operations[i];
            if(key.equals("D"))
            {
                st.push(2*st.peek());
                sum+=st.peek();
                
            }else if(key.equals("C"))
            {   int popped=st.pop();
                sum-=popped;
            }
            else if(key.equals("+"))
            {
                int prev=st.pop();
                int lasttwosum=st.peek()+prev;
                sum+=st.peek()+prev;
                st.push(prev);
                st.push(lasttwosum);
            }else
            {
                sum+=Integer.parseInt(key);
                st.push(Integer.parseInt(key));
            } i++;
        }return sum;
    }
}
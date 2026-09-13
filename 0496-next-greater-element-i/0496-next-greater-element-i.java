class Solution {
    public int[] nextGreaterElement(int[] nums1,int[] arr) {
        int n=arr.length;
        int[] ans=new int[nums1.length];
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            while(!st.isEmpty()&&st.peek()<=curr)
                st.pop();
            if(st.isEmpty())
                hm.put(curr,-1);
            else
                hm.put(curr,st.peek());
            st.push(curr);
        }

        for(int i=0;i<nums1.length;i++)
            ans[i]=hm.get(nums1[i]);

        return ans;
    }
}
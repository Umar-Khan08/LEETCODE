class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int a=0;
        int arr[]=new int[m+n];
       while(i<m && j<n){
        if(nums1[i]>nums2[j]){
            arr[a]=nums2[j];
            j++;
            a++;
        }
        else{
            arr[a]=nums1[i];
            i++;
            a++;
        }
      
       }

        while(i<m){
      arr[a]=nums1[i];
      i++;
      a++;
       }
       while(j<n){
      arr[a]=nums2[j];
      j++;
      a++;
       }

       for(int x=0;x<m+n;x++){
        nums1[x]=arr[x];
       }

    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int i:nums){
            map.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!map.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
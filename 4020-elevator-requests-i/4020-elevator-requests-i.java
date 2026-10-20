class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int floor=requests[0];
        for(int i=1;i<requests.length;i++){
            floor+=Math.abs(requests[i]-requests[i-1]);
        }
        return floor;
    }
}
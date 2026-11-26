class Solution {
    public boolean canAliceWin(int n) {
     int a=10;
     int cnt=0;
     while(n>=a){
        n-=a;
        a--;
        cnt++;
     }
      return cnt%2==1;
     }
}
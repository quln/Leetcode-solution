class Solution {
    public int mySqrt(int x) {
       if(x==0 || x==1){
           return x;
       }
        
        int s = 1;
        int e = x/2;
        int sqrt=0;
        
        while(s<=e){
            int mid=(s+e)/2;
            if(mid<=x/mid){
                sqrt=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return sqrt;
    }
}

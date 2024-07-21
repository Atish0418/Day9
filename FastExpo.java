package Day9;

class Solution {
    public double myPow(double x, int n) {

        if(n == 0){
            return 1;
        }
        
        long N = n;

        if(n < 0){
            x = 1/x;
            N = -N;
        }

        double ans = 1;

        while(N > 0){
            if((N & 1) != 0){
                ans = ans * x;
            }
            x = x*x;
            N = N>>1;
        }
        return ans;
    }
}
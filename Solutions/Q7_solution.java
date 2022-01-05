class Solution {
    static int findPosition(int N , int M , int K) {
        // code here
        if(N==1) return 1;
        int ans = M%N+K-1;
        if(ans == N) return ans;
        return ans%N;
    }
}

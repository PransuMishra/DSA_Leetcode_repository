class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1; i<=n; i++){
            if(i%m == 0) {
                sum2 += i;
            }else{
                sum1 += i;
            }
        }
        int diff = sum1 - sum2;
        return diff;
    }
}
// This is first code who is run in firt time :
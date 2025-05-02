// class Solution {
//     public int maxCount(int m, int n, int[][] ops) {
//         int [] common = new int [] {m, n};
//         for(int [] op : ops ){
//             common[0] = Math.min(common[0], op[0]);
//             common[1] = Math.min(common[1], op[1]);
//         }
//         return common[0] * common[1];
//     }
// }

class Solution {
    public int maxCount(int m, int n, int[] [] ops){
        int minRows = m;
        int minCols = n;

        for(int [] op : ops){
            minRows = Math.min(minRows, op[0]);
            minCols = Math.min(minCols, op[1]);
        }
        return minRows * minCols;
    }
}
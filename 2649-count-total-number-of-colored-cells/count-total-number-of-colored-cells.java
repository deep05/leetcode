class Solution {
    public long coloredCells(int n) {
        long sum = 0;
        sum = (long)n*n + (long)(n-1)*(n-1);
        return sum;
    }
}
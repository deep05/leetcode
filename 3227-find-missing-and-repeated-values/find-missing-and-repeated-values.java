class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;
       boolean[] seen = new boolean[n*n + 1];
       int repeated = -1;
       int missing = -1;

       for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            int element = grid[i][j];
            if(seen[element]){
                repeated = element;
            }
            seen[element] = true;
        }
        }
        for(int i = 1; i <= n*n; i++){
            if(!seen[i]){
                missing = i;
                break;
            }
        }
        return new int[]{repeated, missing};
    }
}
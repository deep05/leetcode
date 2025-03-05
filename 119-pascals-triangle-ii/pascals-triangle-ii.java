class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] result = new int[rowIndex+1][rowIndex+1];
        result[0][0] = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= rowIndex; i++){
            for(int j = 1; j <= i; j++){
                if(j-1==0){
                    result[i][j-1] = 1;
                }
                if(i == j){
                    result[i][j] = 1;
                }else{
                result[i][j] = result[i-1][j] + result[i-1][j-1];
                }
            }
        }
        for(int i = 0; i <= rowIndex; i++){
            list.add(result[rowIndex][i]);
        }
        return list;
    }
}
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i <= n-k; i++){
            int len = 0;
            for(int j = i; j < i+k; j++){
                if(blocks.charAt(j) == 'W'){
                    len++;
                }
            }
            minLen = Math.min(len, minLen);
        }
        return minLen;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int prefix = 0;
        int evenCount = 1;
        int oddCount = 0;
        int total = 0;
        for(int i = 0; i < n; i++){
            prefix += arr[i];
            if(prefix % 2 != 0){
                total = (total + evenCount)%1000000007;
                oddCount++;
            }else{
                total = (total + oddCount)%1000000007;
                evenCount++;
            }
        }
        return total;
    }
}
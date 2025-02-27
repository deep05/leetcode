class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n= arr.length;
        Set<Integer> values = new HashSet<>();
        for(int num : arr){
            values.add(num);
        }

        int longest = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int a = arr[i];
                int b = arr[j];
                int fibLen = 2;
                while(values.contains(a+b) == true){
                    int sum = a+b;
                    a = b;
                    b = sum;
                    fibLen++;
                }
                if(fibLen > 2){
                    longest = Math.max(longest, fibLen);
                }
            }
        }
        return longest;
    }
}
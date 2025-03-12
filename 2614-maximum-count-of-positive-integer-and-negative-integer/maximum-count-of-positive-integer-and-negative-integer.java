class Solution {
    public int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        int result = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                positiveCount++;
            }
            else if(nums[i] < 0){
                negativeCount++;
            }
            result = Math.max(positiveCount, negativeCount);
        }
        return result;
    }
}
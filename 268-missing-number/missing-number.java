class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int missing = -1;
        int n = nums.length;
        for(int i = 0; i <n; i++){
            list.add(nums[i]);
        }
        for(int i = 0; i <=n ; i++){
            if(!list.contains(i)){
                missing = i;
            }
        }
        return missing;
    }
}
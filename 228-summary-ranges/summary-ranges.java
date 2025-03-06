class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int start = nums[i];
            String st = Integer.toString(start);
            while(i < nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(start == nums[i]){
                list.add(Integer.toString(start));
            }else{
                st += "->" + Integer.toString(nums[i]);
                list.add(st);
            }
        }
        return list;
    }
}
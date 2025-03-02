class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> nums3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] == nums2[j][0]){
               nums3.add(new int[]{nums1[i][0], nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                nums3.add(nums1[i]);
                i++;
            }
            else{
               nums3.add(nums2[j]);
                j++;
            }
        }
        while(i < nums1.length){
            nums3.add(nums1[i]);
            i++;
        }
        while(j < nums2.length){
            nums3.add(nums2[j]);
            j++;
        }
        int [][] result = new int[nums3.size()][2];
        for(int k = 0; k < nums3.size(); k++){
            result[k] = nums3.get(k);
        }
        return result;
    }
}
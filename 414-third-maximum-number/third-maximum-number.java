class Solution {
    public int thirdMax(int[] nums) {
        Integer fmax = null;
        Integer smax = null;
        Integer tmax = null;
        for(Integer e : nums){
            if(e.equals(fmax) || e.equals(smax) || e.equals(tmax)){
                continue;
            }
            if(fmax == null || e > fmax){
                tmax = smax;
                smax = fmax;
                fmax = e;
            }else if(smax == null || e > smax){
                tmax = smax;
                smax = e;
            }else if(tmax == null || e > tmax){
                tmax = e;
            }
        }
        return tmax == null ? fmax : tmax;
    }
}
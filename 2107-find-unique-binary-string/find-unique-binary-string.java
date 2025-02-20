class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add("0");
        queue.add("1");
        int n = nums.length;

        while(!queue.isEmpty()){
            String curr = queue.remove();
            if(curr.length() == n){
                result.add(curr);
                continue;
            }
            String first = curr;
            String second = curr;
            first = first + "0";
            second = second + "1";
            queue.add(first);
            queue.add(second);
        }
        for(int i = 0; i < result.size(); i++){
            String element = result.get(i);
            Boolean bool = Arrays.asList(nums).contains(element);
            if(bool == false){
                return element;
            }
        }
        return "";
    }
}
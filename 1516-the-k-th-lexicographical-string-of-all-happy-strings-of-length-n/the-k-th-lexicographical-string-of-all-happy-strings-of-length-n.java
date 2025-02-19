class Solution {
    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");

        while(!queue.isEmpty()){
            String curr = queue.remove();
            if(curr.length() == n){
                result.add(curr);
                continue;
            }
            String first = curr;
            String second = curr;

            if(curr.endsWith("a")){
                first += "b";
                second += "c";
            }
            else if(curr.endsWith("b")){
                first += "a";
                second += "c";
            }
            else{
                first += "a";
                second += "b";
            }
            queue.add(first);
            queue.add(second);
        }
        if(result.size() < k)
            return "";
        return result.get(k-1);
    }
}
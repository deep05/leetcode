class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int count = 1;
        String result = "";
        for(char ch : pattern.toCharArray()){
            if(ch == 'I'){
                st.push(count);
                while(!st.isEmpty()){
                    result = result + Integer.toString(st.pop());
                }
                count++;
            }else{
                st.push(count);
                count++;
            }
        }
        st.push(count);
        while(!st.isEmpty()){
            result = result + Integer.toString(st.pop());
        }
        return result;
    }
}
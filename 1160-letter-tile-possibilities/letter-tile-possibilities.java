class Solution {
    //https://ww w.youtube.com/watch?v=k3XBSQTnETU
    
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for(char ch : tiles.toCharArray()){
            freq[ch - 'A']++;
        }
        return buildString(freq);
    }
    public int buildString(int[] freq){
        int ways = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0){
                freq[i]--;
                ways += 1 + buildString(freq);
                freq[i]++;
            }
        }
        return ways;
    }


}



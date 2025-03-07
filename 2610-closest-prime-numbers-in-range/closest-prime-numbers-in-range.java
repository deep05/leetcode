class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primeList = new ArrayList<>();
        int[] result = new int[2];
        for(int i = left; i <= right; i++){
            if(isPrime(i))
                primeList.add(i);
        }
        System.out.println(primeList);
        int size = primeList.size();
        int min = Integer.MAX_VALUE;
        if(size < 2){
            return new int[]{-1, -1};
        }
        for(int i = size-1; i > 0; i--){
            if(primeList.get(i) - primeList.get(i-1) <= min){
                min = primeList.get(i) - primeList.get(i-1);
                result[0] = primeList.get(i-1);
                result[1] = primeList.get(i);
            }
        }
        return result;
    }
    public Boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
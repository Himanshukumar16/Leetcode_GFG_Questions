class Solution {
    public int countPrimes(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] isPrimeArr = new int[n + 1];
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrimeArr[i] == 0) {
                for (int j = i * i; j < n; j += i) {
                    isPrimeArr[j] = 1;
                }
            }
        }
        for (int i = 2; i < isPrimeArr.length-1; i++) {
            if (isPrimeArr[i] == 0) al.add(i);
        }
        return al.size();
    }
}
class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> ansArr = new ArrayList<>();
        ansArr.add(1);
        int ans = 1;
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            ansArr.add(ans);
        }
        return ansArr;
    }
}
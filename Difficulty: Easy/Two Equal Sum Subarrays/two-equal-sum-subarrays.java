class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum = 0;
        for (int i : arr) sum += i;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (sum - 2 *currSum == 0) return true;
        }
        return false;
    }
}

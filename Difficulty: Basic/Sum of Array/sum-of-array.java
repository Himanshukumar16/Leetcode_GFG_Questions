class Solution {
    public int arraySum(int arr[]) {
        // code here
        return sum(arr, arr.length - 1);
    }
    int sum(int[]arr, int index) {
        if (index == 0) return arr[0];
        return arr[index] + sum(arr, index -1);
    }
}

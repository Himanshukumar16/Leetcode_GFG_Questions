class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) return arr[0];
        int check = (int)(0.25 * arr.length);
        int cnt = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                cnt++;
            } else cnt = 1;
            if (cnt > check) return arr[i];
        }
        return -1;
    }
}
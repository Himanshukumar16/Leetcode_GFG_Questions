class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if (k > arr.length) return -1;
            long max = Integer.MIN_VALUE;
            long sum = 0;
            for (int i : arr) {
                if (max < i) max = i;
                sum += i;
            }
            long low = max;
            long high = sum;
            long ans = 1;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                long cntStu = getStu(arr, mid);
                if (cntStu <= k) {
                    ans = mid;
                    high = mid - 1;
                } else low = mid + 1;
            }
            return (int)ans;
        }
        long getStu(int[] arr, long pages) {
            long stu = 1;
            long pagesPresent = 0;
            for (int i = 0; i < arr.length; i++) {
                if (pagesPresent + arr[i] <= pages) {
                    pagesPresent += arr[i];
                }
                else {
                    stu++;
                    pagesPresent = arr[i];
                }
            }
        return stu;
    }
}
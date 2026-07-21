class Solution {
    public int inversionCount(int nums[]) {
        // code here
        int answer = split(nums, 0, nums.length - 1);
        // For checking if array is sorted or not.
        // for (int i : nums) System.out.print(i+" ");
        return answer;
    }
    public int split(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = low + (high - low) / 2;
        count += split(arr, low, mid);
        count += split(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }
    public int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int count = 0;
        int ptr1 = low;
        int ptr2 = mid+1;
        int index = 0;
        while (ptr1 <= mid && ptr2 <= high) {
            if (arr[ptr1] <= arr[ptr2]) {
                temp[index] = arr[ptr1];
                ptr1++;
                index++;
            }
            else {
                temp[index] = arr[ptr2];
                ptr2++;
                index++;
                count += mid - ptr1 + 1;
            }
        }
        while (ptr1 <= mid) {
            temp[index] = arr[ptr1];
            ptr1++;
            index++;
        }
        while (ptr2 <= high) {
            temp[index] = arr[ptr2];
            ptr2++;
            index++;
        }
        System.arraycopy(temp, 0, arr, low, high - low + 1);
        return count;
    }
}
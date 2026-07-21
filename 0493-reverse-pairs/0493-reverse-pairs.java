class Solution {
    public int reversePairs(int[] nums) {
        int answer = split(nums,0,nums.length-1);
        return answer;
    }
    public int split(int[]arr, int low, int high) {
        
        if (low >= high) return 0;
        int cnt = 0;
        int mid = (high + low) / 2;
        cnt += split(arr, low, mid);
        cnt += split(arr, mid + 1, high);
        cnt += countPairs(arr,low,mid,high);
        merge(arr, low, mid, high);
        return cnt;
    }
    public void merge(int[] arr, int low, int mid, int high) {
        int ptr1 = low;
        int ptr2 = mid + 1;
        int[] temp = new int[high - ptr1 + 1];
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
    }
    public int countPairs(int[] arr,int low, int mid, int high){
        int count = 0;
        int right = mid + 1;
        
        for(int i = low; i <= mid; i++) {
            while (right <= high && (long)arr[i] > 2L * arr[right]) right++;
            count += right - mid - 1;
        }
        return count;
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = 0;
        int ptr2 = 0;
        int index = 0;
        int[] tempArr = new int[n+m];
        while (ptr1 < m && ptr2 < n) {
            if(nums1[ptr1] < nums2[ptr2]) {
                tempArr[index] = nums1[ptr1];
                ptr1++;
                index++;
            } else {
                tempArr[index] = nums2[ptr2];
                ptr2++;
                index++;
            }
        }
        while (ptr1 < m) {
            tempArr[index] = nums1[ptr1];
            ptr1++;
            index++;
        }
        while (ptr2 < n) {
            tempArr[index] = nums2[ptr2];
            ptr2++;
            index++;
        }
        index = 0;
        for (int i : tempArr) {
            // System.out.println(i);
            nums1[index] = i;
            index++;
        }
    }
}
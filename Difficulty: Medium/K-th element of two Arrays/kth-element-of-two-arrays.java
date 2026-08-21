class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int index = 0;
        int i = 0;
        int j = 0;
        int el = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (index == k-1) el = a[i];
                index++;
                i++;
            } else {
                if (index == k-1) el = b[j];
                index++;
                j++;
            }
        }
        while (i < a.length) {
            if (index == k-1) el = a[i];
            index++;
            i++;
        }
        while (j < b.length) {
            if (index == k-1) el = b[j];
            index++;
            j++;
        }
        return el;
    }
}
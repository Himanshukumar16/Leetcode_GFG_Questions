class Solution {
    public double medianOf2(int arr1[], int arr2[]) {
        // Code Here
        int i = 0;
        int j = 0;
        int index = 0;
        int ele1 = 0;
        int ele2 = 0;
        int n = arr1.length + arr2.length;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (index == n / 2) ele2 = arr1[i];
                if (index == (n / 2) - 1) ele1 = arr1[i];
                i++;
                index++;
            } else {
                if (index == n / 2) ele2 = arr2[j];
                if (index == (n / 2) - 1) ele1 = arr2[j];
                j++;
                index++;
            }
        }
        while (i < arr1.length) {
            if (index == n / 2) ele2 = arr1[i];
            if (index == (n / 2) - 1) ele1 = arr1[i];
            i++;
            index++;
        }
        while ( j < arr2.length) {
            if (index == n / 2) ele2 = arr2[j];
            if (index == (n / 2) - 1) ele1 = arr2[j];
            j++;
            index++;
        }
        if (n%2 == 0) return (double)(ele1+ele2)/2.0;
        return (double)ele2;
    }
}
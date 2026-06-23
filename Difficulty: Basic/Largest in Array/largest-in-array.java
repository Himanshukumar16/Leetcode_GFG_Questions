class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) largest = arr[i];
        }
        return largest;
        
        // Arrays.sort(arr);
        // return arr[arr.length-1];
    }
}

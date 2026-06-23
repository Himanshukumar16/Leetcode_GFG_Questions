class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest != Integer.MAX_VALUE) {
            al.add(smallest);
            al.add(secondSmallest);
        }
        else al.add(-1);
        return al;
    }
}

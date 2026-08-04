class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isThere = false;
        for (int i : nums) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        int[] hashArr = new int[max+1];
        for (int i : nums) {
            hashArr[i]++;
        }
        // System.out.println(min + " "+ max);
        for (int i = min+1; i < max; i++) {
            if (hashArr[i] == 0) lst.add(i);
        }
        return lst;
    }
}
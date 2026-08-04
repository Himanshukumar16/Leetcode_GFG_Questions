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
        System.out.println(min + " "+ max);
        for (int i = min+1; i < max; i++) {
            for (int j : nums) {
                if (j == i) isThere = true;
            }
            if (!isThere) lst.add(i);
            isThere = false;
        }
        return lst;
    }
}
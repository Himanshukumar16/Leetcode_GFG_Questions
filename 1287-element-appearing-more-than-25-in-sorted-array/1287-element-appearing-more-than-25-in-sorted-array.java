class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int check = (int)(0.25 * arr.length);
        for (int i : map.keySet()) {
            if (map.get(i) > check) return i;
        }
        return -1;
    }
}
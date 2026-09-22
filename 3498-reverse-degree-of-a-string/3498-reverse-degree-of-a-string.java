class Solution {
    public int reverseDegree(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char ch = 'a';

        for(int i = 26; i >= 1; i--) {
            map.put(ch,i);
            ch++;
        }
        System.out.print(map);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += (map.get(s.charAt(i)) * (i + 1));
        }

        return sum;
    }
}
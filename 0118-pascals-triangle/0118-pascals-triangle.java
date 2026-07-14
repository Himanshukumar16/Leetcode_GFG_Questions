class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int ans = 1;
            List<Integer> temp = new ArrayList<>();
            temp.add(ans);
            for (int j = 1; j < i; j++) {
                ans = ans * (i - j);
                ans = ans / j;
                temp.add(ans);
            }
            answer.add(temp);
        }
        return answer;
    }
}
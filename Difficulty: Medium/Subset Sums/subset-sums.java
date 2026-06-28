class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> lst = new ArrayList<>();
        subsets(arr,new ArrayList<>(),lst,0,0);
        return lst;
    }
    public void subsets(int[]arr, ArrayList<Integer>lst,ArrayList<Integer>result,int sum, int index) {
        if (index == arr.length) {
            result.add(sum);
            return;
        }
        lst.add(arr[index]);
        subsets(arr,lst,result,sum+arr[index],index+1);
        lst.removeLast();
        subsets(arr,lst,result,sum,index+1);
    }
}
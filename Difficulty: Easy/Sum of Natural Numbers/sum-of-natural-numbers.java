import java.util.Scanner;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code here
        System.out.println(sumOfNumber(n, 0));
    }
    static int sumOfNumber(int n, int sum) {
        if(n == 0) return sum;
        sum += n;
        return sumOfNumber(n-1,sum);
    }
}
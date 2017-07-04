package problems;


public class EvenFibonacci {

    private int a, b, sum, even;

    public EvenFibonacci() {
        a = 0;
        b = 1;
        sum = 2;
        computeFibonacci();
    }
    private void computeFibonacci() {

        while (sum <= 4000000) {
            sum = a + b;
            a = b;
            b = sum;
            if (sum % 2 == 0 && even <= 4000000) {
                even = sum + even;
                System.out.println(even);
            }
        }
    }
}

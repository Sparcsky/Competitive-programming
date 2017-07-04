package problems;

public class SumSquareDifference {

    private long squareSum, difference;
    private long sumSquare, sum;


    public SumSquareDifference() {
        difference = computeSquareSum(100) - computeSumSquare(100);
        System.out.println(difference);
    }

    private long computeSumSquare(int a) {
        for (int i = 0; i <= a; i++) {
            sumSquare = (i * i);
            sum = sum + sumSquare;
        }
        sumSquare = sum;
        return sumSquare;
    }

    private long computeSquareSum(int a) {
        for (int i = 0; i <= a; i++) {
            squareSum = squareSum + i;
        }
        return squareSum * squareSum;

    }
}

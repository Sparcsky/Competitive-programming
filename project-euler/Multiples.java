package problems;

public class Multiples {

    private int[] numArray;
    private int sum;

   public Multiples() {
        numArray = new int[1000];
        sum = 0;
        computeMultiple();
    }

    private void computeMultiple() {
        for (int i = 0, j = 0; i < numArray.length; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numArray[j] = i;
                sum = numArray[j] + sum;
                j++;
            }
        }
        System.out.println(sum);
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

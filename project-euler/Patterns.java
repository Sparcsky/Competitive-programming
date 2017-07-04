/**
 * Author IanJasper.
 */
public class Main {

    public static void main(String[] args) {
        int ROW = 10, COL = 5, copyRow = COL;
        //pyramid #1:
        for (int i = 0; i < COL; i++) {
            for (int j = 0; j < ROW - i; j++) {
                if (j < i) {
                    System.out.print(" ");
                    continue;
                }
                if (j < 5) System.out.print(COL - j);
                if ((COL - 1) - j == 0) copyRow = 2;
                if (j > 5) {
                    System.out.print(copyRow++);
                }
            }
            System.out.println();
        }
        printSpace(1);
        //pyramid #2:
        char ch, chI;
        for (chI = 'E'; chI >= 'A'; chI--) {
            for (ch = 'A'; ch <= chI; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        printSpace(1);
        //pyramid #3:
        ch = 'A';
        chI = 'a';
        copyRow = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < copyRow; j++) {
                if (j % 2 == 0) {
                    System.out.print(ch);
                    System.out.print(chI);
                } else System.out.print(" ");
            }
            copyRow += 2;
            ch++;
            chI++;
            System.out.println();

        }
//
        printSpace(1);
        //pyramid #4:
        ROW = 1;
        int f = 1;
        for (int x = 0; x < 2; x++) {
            while (f <= COL) {
                if (x == 1) ROW -= 2;
                for (int j = 0; j < ROW; j++) {
                    if (j == 8) continue;
                    if (j % 2 != 0) print("*");
                    else {
                        if (x == 1) print(COL - f);
                        if (x == 0) print(f);
                    }
                }
                if (x == 0)
                    if (f != COL) ROW += 2;

                println();
                f++;
            }
            f = 1;
        }

        printSpace(0);
        //pyramid #5:
        ROW = 10;
        COL = 5;
        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < COL; i++) {
                for (int j = 0; j <= ROW; j++) {
                    if (x == 0) {
                        if (j < i || j > ROW - i) print(" ");
                        else print("*");
                    }
                    if (x == 1) {
                        if (j < COL - i || j > COL + i) print(" ");
                        else print("*");
                    }
                }
                System.out.println();
            }
        }
        printSpace(1);
        //pyramid #4:

        for (int x = 0; x < 2; x++) {

            for (int i = 1; i <= COL; i++) {
                for (int j = 1; j <= ROW; j++) {
                    if (x == 0) {
                        if (j <= COL - i || j > COL + i) {
                            System.out.print(" ");
                            continue;
                        }
                        if (j == COL + i - 1 || j == ROW - i - 4) {
                            System.out.print(i);
                        } else System.out.print(" ");
                    }
                    if (x == 1) {
                        if (j == i|| j == ROW - i) {
                            int t = COL;
                            System.out.print(t -= i);
                        }else System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }
    }

    private static void printSpace(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println();
        }
    }

    private static void print(String str) {
        System.out.print(str);
    }

    private static void print(int num) {
        System.out.print(num);
    }

    private static void println() {
        System.out.println();
    }
}

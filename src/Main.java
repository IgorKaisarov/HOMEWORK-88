import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println(" Task 1 ");

        int[] t = new int[3];
        t[0] = 1;
        t[1] = 2;
        t[2] = 3;

        float[] second = new float[]{1.57f, 7.654f, 9.986f};

        int[] third = new int[15];

        // Task 2
        System.out.println(" Task 2 ");

        int[] first = new int[]{1, 2, 3};
        for (int h = 0; h < first.length; h++) {
            if (h == first.length - 1) {
                System.out.print(first[h]);
            } else {
                System.out.print(first[h] + ", ");
            }
        }

        float[] secondNew = new float[]{1.57f, 7.654f, 9.986f};
        for (int i = 0; i < secondNew.length; i++) {
            if (i == secondNew.length - 1) {
                System.out.print(secondNew[i]);
            } else {
                System.out.print(secondNew[i] + ", ");
            }
        }

        int[] thirdNew = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int g = 0; g < thirdNew.length; g++) {
            if (g == thirdNew.length - 1) {
                System.out.print(thirdNew[g]);
            } else {
                System.out.print(thirdNew[g] + ", ");
            }
        }


        // Task 3
        System.out.println(" Task 3 ");

        int[] firstOne = new int[]{1, 2, 3};
        for (int j = firstOne.length - 1; j >= 0; j--) {
            System.out.print(firstOne[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }


        float[] secondNewT = new float[]{1.57f, 7.654f, 9.986f};
        for (int b = secondNewT.length - 1; b >= 0; b--) {
            System.out.print(secondNewT[b]);
            if (b > 0) {
                System.out.print(", ");
            }
        }

        int[] thirdNewT = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int p = thirdNewT.length - 1; p >= 0; p--) {
            System.out.print(thirdNewT[p]);
            if (p > 0) {
                System.out.print(", ");
            }
        }

        // Task 4
        System.out.println(" Task 4 ");

        int[] taskFour = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int w = 0; w < taskFour.length; w++) {
            if (taskFour[w] % 2 != 0) {
                taskFour[w] += 1;
            }
        }
        System.out.println(Arrays.toString(taskFour));
    }
}





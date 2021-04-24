import java.util.Arrays;

    public class Lesson_3 {
        public static void main(String[] args) {
            ex1();
            ex2();
            ex3();
            ex4();
            ex5();
            ex6();
        }

        public static void ex1() {
            int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(array));

            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        public static void ex2() {
            int[] ex2 = new int[100];
            int a = 1;
            for (int i = 0; i < ex2.length; i++) {
                ex2[i] = a;
                a = a + 1;
            }
            System.out.println(Arrays.toString(ex2));
        }

        public static void ex3() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                int b = arr[i];
                if (b < 6) {
                    arr[i] = b * 2;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        public static void ex4() {
            int[][] ex4 = new int[8][8];
            int lastIndex = ex4.length - 1;
            for (int i = 0; i < ex4.length; i++) {
                ex4[i][i] = ex4[i][lastIndex - i] = 1;
                System.out.println(Arrays.toString(ex4[i]));
            }
        }

        public static void ex5() {
            int len = 8;
            int initialValue = 9;
            int[] ex5 = array(len, initialValue);
            System.out.println(Arrays.toString(ex5));
        }

        private static int[] array(int len, int initialValue) {
            int[] ex5 = new int[len];
            for (int i = 0; i < ex5.length; i++) {
                ex5[i] = initialValue;
            }
            return ex5;
        }

        public static void ex6() {
            int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int min = c[0];
            int max = c[0];
            for (int i = 1; i < c.length; i++) {
                if (c[i] < min) {
                    min = c[i];
                }
                if (c[i] > max) {
                    max = c[i];
                }
            }
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
    }
}

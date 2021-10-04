public class BubbleSort {

    public static void main(String args[]) {
        int array[] = { 2, 8, 5, 3, 9, 4, 1, 12, 20, 100, 2 };
        int j = array.length;
        while (j >= 0) {
            for (int i = 0; i < j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // swap
                    int tmep;
                    tmep = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmep;
                }
            }
            j--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
package Insertion;
public class Insertion {
    int [] array;

    static int[] sort(int[] arr) {
        int  current;
        int  j;
        for (int i = 1; i < arr.length; ++i) {
            current = arr[i];
             j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }


}

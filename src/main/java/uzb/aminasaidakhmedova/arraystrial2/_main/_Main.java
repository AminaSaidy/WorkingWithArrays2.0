package uzb.aminasaidakhmedova.arraystrial2._main;

import uzb.aminasaidakhmedova.arraystrial2.service.SortArray;

import static uzb.aminasaidakhmedova.arraystrial2.service.CreateArray.createArray;

public class _Main {
    public static void main(String[] args) {

        System.out.println("Enter 4 numbers into the array: ");
        int[] arr = createArray(4);
        SortArray.sortArray(arr);

        System.out.println("Sorted array: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
}

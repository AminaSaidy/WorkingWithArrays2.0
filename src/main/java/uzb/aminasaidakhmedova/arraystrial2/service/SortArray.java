package uzb.aminasaidakhmedova.arraystrial2.service;

public class SortArray {
    public static int[] sortArray(int[] arr) {
        int temporary;

        for (int i = 0; i < (4-1); i++) {
            for (int j = 0; j < (4-i-1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temporary = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
        return arr;
    }
}

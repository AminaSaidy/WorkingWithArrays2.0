package uzb.aminasaidakhmedova.arraystrial2.service;

import java.util.Scanner;

public class CreateArray {
    public static int[] createArray(int length) {
        int[] arr = new int [length];
        for (int i = 0; i < 4; i++) {
            Scanner inputInt = new Scanner(System.in);
            arr[i] = inputInt.nextInt();
        }
        return arr;
    }
}

package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.Scanner;

public class P21_RotateArrKthStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.print("enter k: ");
        int k = sc.nextInt();

        rotateArr(arr, k);

    }

    private static void rotateArr(int[] arr, int k) {
        /*
        * suppose k=3
        * expected output = 1,2,5,4,3
        */

        //step-1: Reverse entire arr => 5,4,3,2,1
        reverse(arr, 0, arr.length-1);
        //step-2: Reverse first 3 elements of reversed arr => 3,4,5,2,1
        reverse(arr, 0, k-1);
        //step-3: Reverse the arr which comes in step-2 => 1,2,5,4,3
        reverse(arr, 0, arr.length-1);

        System.out.println("Rotate Arr: " + Arrays.toString(arr));
    }

    private static void reverse(int[]arr, int i, int j){
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

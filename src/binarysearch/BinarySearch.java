/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author omerr
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static int findKey(int[] array, int key) {
        int high = array.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index;
        int key;
        int[] array = {2, 5, 4, 8, 7, 4, 6, 9, 2, 7, 1, 5, 9, 14, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Please input key: ");
        key = input.nextInt();
        index = findKey(array, key);
        System.out.println(key + " is at " + index + " index");

    }

}

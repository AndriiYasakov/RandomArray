package com.itvdn.javaStarter.randomArray;

public class PrinterArray {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
//            System.out.println("\n");
        }
        System.out.println("\n");
    }
    public void printArrayReverse(int[] arr) {
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
//            System.out.println("\n");
        }
        System.out.println("\n");
    }
    public void sortArray (int[] arr){

    }
}

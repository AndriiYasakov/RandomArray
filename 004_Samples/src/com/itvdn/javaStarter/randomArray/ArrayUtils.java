package com.itvdn.javaStarter.randomArray;

public class ArrayUtils {

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
           for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int min_i = i;
                    for (int j = i+1; j < arr.length; j++) {
                        if (arr[j] < min) {
                        min = arr[j];
                        min_i = j;
                    }
                }
                    if (i != min_i) {
                    int tmp = arr[i];
                    arr[i] = arr[min_i];
                    arr[min_i] = tmp;
                }
               System.out.print(arr[i]+" ");
            }
        System.out.println("\n");
        }

    }


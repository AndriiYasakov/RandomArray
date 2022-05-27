package com.itvdn.javaStarter.randomArray;

public class Start {
    public static void main(String[] args) {
        RandomArray arr = new RandomArray();
        PrinterArray print = new PrinterArray();
        int [] ddd = new int[15];
        arr.arraysNew(ddd);
        print.printArray(ddd);
        print.printArrayReverse(ddd);
        arr.arraysNew();
        print.printArray(arr.getRandomArray());
        print.printArrayReverse(arr.getRandomArray());
    }
}

package com.itvdn.javaStarter.randomArray;

public class Start {
    public static void main(String[] args) {
        RandomArray arr = new RandomArray();
        ArrayUtils utils = new ArrayUtils();
//        int [] ddd = new int[15];
//        arr.arraysNew(ddd);
//        utils.printArray(ddd);
//        utils.printArrayReverse(ddd);
        arr.arraysNew();
        utils.printArray(arr.getRandomArray());
        utils.printArrayReverse(arr.getRandomArray());
        utils.sortArray(arr.getRandomArray());
    }
}

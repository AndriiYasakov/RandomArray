package com.itvdn.javaStarter.randomArray;

import java.util.Random;

public class RandomArray {
    private Random random = new Random();
    private int quantityElements = random.nextInt(30);
    private int[] randomArray = new int[quantityElements];

    public void arraysNew () {
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) ((Math.random() * 201) - 100);
        }
    }
    public void arraysNew (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 201) - 100);
        }
    }


    public RandomArray() {
    }


    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getQuantityElements() {
        return quantityElements;
    }

    public void setQuantityElements(int quantityElements) {
        this.quantityElements = quantityElements;
    }

    public int[] getRandomArray() {
        return randomArray;
    }

    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }
}

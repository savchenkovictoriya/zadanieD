package vika.savchenko;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("sex");
        System.out.println("Dima pidor");
        int[] array = new int[10];
        Random random = Random.from(RandomGenerator.getDefault());
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
    }


}
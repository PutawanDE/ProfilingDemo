package com.Lab_Demo.Profiling;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        Random random = new Random();
        List<Double> evenResult = new LinkedList<>();

        while (true){
            int r = random.nextInt();
            if (r % 2 == 0) {
                evenResult.add(processEven(r));
            } else {
                processOdd(r);
            }
        }
    }

    private static double processEven(int n) {
        double d = 0.0;
        for (int i = 0; i < 10000; i++) {
            d += Math.sin(n) / Math.cos(n);
        }
        return d;
    }

    private static void processOdd(int n) {
        String oddStr = "";
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = n;
            oddStr += ", " + n;
        }
    }
}

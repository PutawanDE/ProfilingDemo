package com.Lab_Demo.Profiling;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class StringRepeater {
    public static void main(String[] args) {
        while (true) {
            try {
                PrintWriter writer = new PrintWriter("output.txt", StandardCharsets.UTF_8);
                writer.println(repeatString("hello", 1000000));
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String repeatString(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(s);
        }
        return res.toString();
    }
}

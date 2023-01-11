package com.Lab_Demo.Profiling;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeak {
    public static void main(String[] args) {
        memLeakFromHashMap_whenNoEqualsHashCodeMethods();
    }

    private static void memLeakFromHashMap_whenNoEqualsHashCodeMethods() {
        Map<Object, Object> map = new HashMap<>();
        while (true) {
            map.put(new Key("name"), "value");
        }
    }
}

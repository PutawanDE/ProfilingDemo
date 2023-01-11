package com.Lab_Demo.Profiling;

public class Key {
    public final String keyName;

    public Key(String keyName) {
        this.keyName = keyName;
    }

    // Comment out code below to fix memory leak
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Key k) {
//            return this.keyName.equals(k.keyName);
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return this.keyName.hashCode();
//    }
}

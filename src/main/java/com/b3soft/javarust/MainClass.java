package com.b3soft.javarust;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello...");
    }

    public native int timesRust(int input);

    static {
        System.load("/Users/discovery/work/librust/target/debug/liblibrust.dylib");
    }
}

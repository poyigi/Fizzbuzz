package com.poyigi;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 2 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i + " even");
            }
        }
    }
    }

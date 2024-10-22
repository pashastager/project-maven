package by.itacademy.kalinkov;

import java.util.Arrays;

public class MainB {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println("Five");
            } else if (i % 7 == 0) {
                System.out.println("Seven");
            } else {
                System.out.println(i);
            }
        }
    }
}

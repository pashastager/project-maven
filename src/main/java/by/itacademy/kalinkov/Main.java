package by.itacademy.kalinkov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 4 == 0) {
                System.out.println("Число " + i + " кратно 4-м");
                continue;
            }
            if (i % 9 == 0) {
                System.out.println("Число " + i + " кратно 9-ти");
                continue;
            }
            if (i % 4 == 0 && i % 9 == 0) {
                System.out.println("Число " + i + " кратно 4-м и 9-ти");
                continue;
            }
            System.out.println(i);
        }
    }
}
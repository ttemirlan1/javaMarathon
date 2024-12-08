package day2;

import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int flour = scanner.nextInt();
    if (flour > 1 && flour <=4) {
        System.out.println("Малоэтажный дом");
    }
    if (flour > 4 && flour <=8) {
            System.out.println("Средний дом");
    }
    if (flour > 9) {
            System.out.println("Многоэтажный дом");
    }
    if (flour < 0) {
        System.out.println("Ошибка ввода");
    }
    }
}
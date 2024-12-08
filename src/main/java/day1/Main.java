package day1;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            System.out.print("Java ");
            i++;
        }
        for (int j = 0; j < 10; j++) {
            System.out.print("Java ");
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("Java ");
        }
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year+=4;
        }
        for (int year_2 = 1980; year_2 <= 2020; year_2+=4) {
            System.out.println("Олимпиада " + year_2 + " года");
        }
    }

}
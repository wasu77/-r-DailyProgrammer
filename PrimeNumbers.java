package com.company;

import java.util.Scanner;
/*
DailyProgrammer #20 EASY - find all prime numbers below 2000
Program allows to type specific number, not only 2000, but you must remember that it can't be too.. long :)
 */

public class PrimeNumbers {

    int liczba;

    void prompt() {
        System.out.println("Podaj liczbę do której chcesz mieć wyświetlone wszystkie liczby pierwsze.");
        Scanner input = new Scanner(System.in);
        liczba = input.nextInt();
    }
    void count() {
        for (int i = 2; i <= liczba; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumbers lp1 = new PrimeNumbers();
        lp1.prompt();
        lp1.count();
    }
}

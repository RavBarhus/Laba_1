package com.company;

public class Primes {
    public static void main( String[] args) {
        for (int i = 1; i != 100; i++) { // Цикл, в котором прогоняем числа в заданном диапазоне
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // Основной цикл программы
                return false;
            }
        }
        return true;
    }
}

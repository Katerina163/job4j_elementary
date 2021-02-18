package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        double year = 0;
        while (amount > 0) {
            year++;
            amount = (amount + amount * percent / 100) - salary;
        }
        return (int) year;
    }
}

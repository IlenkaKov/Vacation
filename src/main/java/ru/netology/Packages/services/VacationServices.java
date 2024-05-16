package ru.netology.Packages.services;

public class VacationServices {

    public int calcVacationServices(int income, int expense, int threshold) {
        int count = 0; //счётчик месяцев отдыха;
        int money;
        money = 0; //количество денег на счету;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money = money + income;
                money = money - expense;

            } else {
                money = money - expense;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            }
        }
        return count;
    }
}
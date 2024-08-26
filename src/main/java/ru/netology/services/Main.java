package ru.netology.services;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        VacationCalculation service = new VacationCalculation();

        int count = service.calculate(10_000, 3_000, 20_000);
        System.out.println("В следующем году отдохнём: " + count + " месяца(ев)");

    }

}
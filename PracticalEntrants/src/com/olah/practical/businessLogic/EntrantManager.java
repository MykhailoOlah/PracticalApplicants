package com.olah.practical.businessLogic;

import java.util.Arrays;

public class EntrantManager {

    public static Entrant[] entrantArrays;

    public EntrantManager() {
        entrantArrays = new Entrant[10];
        entrantArrays[0] = new Entrant("Багатодітна", "Іван", "Молнар", "Вулиця Головна 26", 70,
              60);
        entrantArrays[1] = new Entrant("Малодітна", "Олена", "Коваль", "Вулиця Заводська 12", 55,
              44);
        entrantArrays[2] = new Entrant("Багатодітна", "Петро", "Сидоренко", "Вулиця Паркова 45", 89,
              82);
        entrantArrays[3] = new Entrant("Малодітна", "Марія", "Петренко", "Вулиця Лісова 22", 44,
              56);
        entrantArrays[4] = new Entrant("Багатодітна", "Анна", "Іваненко", "Вулиця Центральна 30",
              61,
              70);
        entrantArrays[5] = new Entrant("Малодітна", "Віктор", "Семенов", "Проспект Спортивний 8",
              95,
              88);
        entrantArrays[6] = new Entrant("Багатодітна", "Наталія", "Кравець", "Вулиця Городецька 5",
              46,
              50);
        entrantArrays[7] = new Entrant("Малодітна", "Андрій", "Лисенко", "Вулиця Перша 17", 57, 52);
        entrantArrays[8] = new Entrant("Багатодітна", "Михайло", "Шевченко", "Вулиця Набережна 11",
              92,
              95);
        entrantArrays[9] = new Entrant("Малодітна", "Ольга", "Григоренко", "Вулиця Паркова 3", 54,
              58);
    }

    public void notEnrolled() {
        for (Entrant entrant : entrantArrays) {
            if (entrant.getFirstModule() < 60 || entrant.getSecondModule() < 60) {
                System.out.println(entrant);
            }
        }
    }

    public void notLessThanGiven(int mark) {
        for (Entrant entrant : entrantArrays) {
            if (entrant.getFirstModule() + entrant.getSecondModule() >= mark) {
                System.out.println(entrant);
            }
        }
    }

    public void nAttributes(int rating) {
        Arrays.sort(entrantArrays,
              (a, b) -> (b.getFirstModule() + b.getSecondModule()) - (a.getFirstModule()
                    + a.getSecondModule()));
        for (int i = 0; i < entrantArrays.length && i < rating; i++) {
            System.out.println(entrantArrays[i]);
        }
    }
}

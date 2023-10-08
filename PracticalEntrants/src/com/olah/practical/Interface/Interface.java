package com.olah.practical.Interface;

import static com.olah.practical.businessLogic.EntrantManager.entrantArrays;

import com.olah.practical.businessLogic.EntrantManager;
import java.util.Scanner;

public class Interface {

    public static void runner() {
        Scanner in = new Scanner(System.in);
        EntrantManager entrantManager = new EntrantManager();

        int choice;
        int mark;
        int rating;

        do {
            System.out.println("Головне меню:");
            System.out.println("1: Cписок абітурієнтів, які мають оцінки нижче 60");
            System.out.println("2: Cписок абітурієнтів, сума балів у яких не менше заданої");
            System.out.println("3: Список N абітурієнтів, які мають саму високу кількість балів");
            System.out.println("0: Вихід");
            System.out.print("Оберіть операцію: ");

            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Список абітурієнтів: ");
                    title();
                    entrantManager.notEnrolled();
                    break;
                case 2:
                    System.out.print("Введіть оцінку: ");
                    mark = in.nextInt();
                    if (mark > 0 && mark < 200) {
                        System.out.println("Список абітурієнтів: ");
                        title();
                        entrantManager.notLessThanGiven(mark);
                    } else {
                        System.out.println("Невірний вибір, спробуйте ще раз");
                    }
                    break;
                case 3:
                    System.out.print("Введіть потрібну вам кількість абітуріентів: ");
                    rating = in.nextInt();
                    if (rating > 0 && entrantArrays.length > rating) {
                        System.out.println("Список абітурієнтів: ");
                        title();
                        entrantManager.nAttributes(rating);
                    } else {
                        System.out.println("Невірний вибір, спробуйте ще раз");
                    }
                    break;
                case 0:
                    continue;
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз");
            }
        } while (choice != 0);
    }

    public static void title() {
        System.out.println(
              "Family | First Name | Last Name | Address | First Module | Second Module");
        System.out.println(
              "-------------------------------------------------------------------------");
    }
}

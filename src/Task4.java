import java.util.Scanner;

public class Task4 {

    private static double InputCheck(Scanner scanner, String input) {
        System.out.print(input);
        try {
            return scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Ошибка: введено не число");
            scanner.close();
            System.exit(1);
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Программа расчёта кинетической энергии");
        System.out.println(" Формула: Ek = (m * v^2) / 2");

        double mass = InputCheck(scanner, "Введите массу тела в кг (m > 0): ");
        double velocity = InputCheck(scanner, "Введите скорость тела в м/с (v >= 0): ");

        if (mass <= 0) {
            System.out.println("Ошибка: масса должна быть больше 0");
            scanner.close();
            return;
        }

        if (velocity < 0) {
            System.out.println("Ошибка: скорость не может быть отрицательной");
            scanner.close();
            return;
        }

        double kineticEnergy = (mass * velocity * velocity) / 2.0;

        System.out.printf("Масса: %.3f кг%n", mass);
        System.out.printf("Скорость: %.3f м/с%n", velocity);
        System.out.printf("Кинетическая энергия: %.3f Дж%n", kineticEnergy);

        scanner.close();
    }
}
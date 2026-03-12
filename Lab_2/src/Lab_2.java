import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab_2 {
    // Створюємо сканер як статичне поле, щоб він був доступний у всіх методах класу
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // --- Завдання 1: Квадратне рівняння ---
        System.out.println("--- Завдання 1: Квадратне рівняння ---");
        double a = readDouble("Введіть коефіцієнт a: ");
        double b = readDouble("Введіть коефіцієнт b: ");
        double c = readDouble("Введіть коефіцієнт c: ");

        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Корені: x1 = " + x1 + ", x2 = " + x2);
        } else if (disc == 0) {
            System.out.println("Один корінь: x = " + (-b / (2 * a)));
        } else {
            System.out.println("Дійсних коренів немає.");
        }

        // --- Завдання 2: Номер квадранта ---
        System.out.println("\n--- Завдання 2: Номер квадранта ---");
        double x_coord = readDouble("Введіть x: ");
        double y_coord = readDouble("Введіть y: ");

        if (x_coord > 0 && y_coord > 0) System.out.println("I квадрант");
        else if (x_coord < 0 && y_coord > 0) System.out.println("II квадрант");
        else if (x_coord < 0 && y_coord < 0) System.out.println("III квадрант");
        else if (x_coord > 0 && y_coord < 0) System.out.println("IV квадрант");
        else System.out.println("Точка на осі");

        // --- Завдання 3: Перевірка числа ---
        System.out.println("\n--- Завдання 3: Перевірка числа ---");
        int num = (int) readDouble("Введіть ціле число: "); // Приводимо до цілого типу
        int absNum = Math.abs(num);

        if (absNum >= 10 && absNum <= 99 && num % 2 == 0) {
            System.out.println("Число є двозначним і парним.");
        } else {
            System.out.println("Умова не виконується.");
        }

        // --- Завдання 4.1: Функція f(x)  ---
        System.out.println("\n--- Завдання 4.1: Функція f(x) ---");
        double x_val = readDouble("Введіть x для f(x): ");
        double fx;

        if (x_val < -0.5) {
            fx = Math.sin(x_val) - 0.5 * Math.pow(Math.cos(Math.sqrt(Math.abs(x_val))), 3);
        } else if (x_val <= 1) {
            fx = Math.log(Math.abs(1 - x_val)) / Math.log(2);
        } else {
            fx = Math.sqrt(Math.abs(Math.sin(x_val * x_val)));
        }
        System.out.printf("Результат f(x) = %.4f\n", fx);

        // --- Завдання 4.2: Робочий/Вихідний день  ---
        System.out.println("\n--- Завдання 4.2: Робочий/Вихідний день ---");
        int day = (int) readDouble("Введіть номер дня (1-7): ");

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Це робочий день.");
                break;
            case 6: case 7:
                System.out.println("Це вихідний день.");
                break;
            default:
                System.out.println("Невірний номер дня.");
        }
    }

    public static double readDouble(String message) {
        double value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message);
            try {
                value = scan.nextDouble(); // Спроба зчитати число
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Помилка! Будь ласка, введіть число цифрами.");
                scan.next();
            }
        }
        return value;
    }
}
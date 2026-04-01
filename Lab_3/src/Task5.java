import java.util.Scanner;
import java.util.InputMismatchException;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = -2.0, end = 2.0, step = 0.2;
        double minLimit = 0, maxLimit = 0;

        // Блок try-catch для перевірки коректності введення
        try {
            System.out.print("Введіть нижню межу діапазону (число): ");
            minLimit = sc.nextDouble();

            System.out.print("Введіть верхню межу діапазону (число): ");
            maxLimit = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Помилка: Ви ввели не число! Перезапустіть програму.");
            return; // Завершуємо програму, якщо введення некоректне
        }

        System.out.println("\n--- Результати табулювання (for) ---");
        int countFor = 0;
        for (double x = start; x <= end; x += step) {
            double y = Math.pow(x, 2); // Обчислення функції y = x^2
            System.out.printf("x: %.1f | y: %.2f\n", x, y);

            if (y >= minLimit && y <= maxLimit) {
                countFor++;
            }
        }

        displayResult(countFor);

        System.out.println("\n--- Результати табулювання (while) ---");
        int countWhile = 0;
        double x = start;
        while (x <= end ) {
            double y = Math.pow(x, 2);
            if (y >= minLimit && y <= maxLimit) {
                countWhile++;
            }
            x += step;
        }

        displayResult(countWhile);
    }

    // Метод для виведення результату згідно з методичкою
    private static void displayResult(int count) {
        if (count > 0) {
            System.out.println("Кількість значень у діапазоні: " + count);
        } else {
            System.out.println("Повідомлення: Значення в заданому діапазоні відсутні.");
        }
    }
}
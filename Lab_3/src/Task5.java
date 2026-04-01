import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = -2.0, end = 2.0, step = 0.2;

        System.out.print("Введіть нижню межу діапазону: ");
        double minLimit = sc.nextDouble();
        System.out.print("Введіть верхню межу діапазону: ");
        double maxLimit = sc.nextDouble();

        System.out.println("\n--- Реалізація через for ---");
        int countFor = 0;
        for (double x = start; x <= end + step/2; x += step) {
            double y = Math.pow(x, 2); // Функція y = x^2
            System.out.printf("x: %.1f | y: %.2f\n", x, y);
            if (y >= minLimit && y <= maxLimit) countFor++;
        }
        printResult(countFor);

        System.out.println("\n--- Реалізація через while ---");
        int countWhile = 0;
        double x = start;
        while (x <= end + step/2) {
            double y = Math.pow(x, 2);
            if (y >= minLimit && y <= maxLimit) countWhile++;
            x += step;
        }
        printResult(countWhile);
    }

    private static void printResult(int count) {
        if (count > 0) {
            System.out.println("Кількість значень у діапазоні: " + count);
        } else {
            System.out.println("Значення в заданому діапазоні відсутні.");
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ініціалізація допоміжних класів
        Geometry geometry = new Geometry();
        Number numberTool = new Number();
        Array arrayTool = new Array();

        System.out.println("=== Лабораторна робота №5  ===");

        // Scanner створюється в дужках try — він закриється автоматично
        try (Scanner sc = new Scanner(System.in)) {

            // --- Завдання 1: Площа ромба ---
            System.out.println("\n1. Обчислення площі ромба (Варіант 4)");
            System.out.print("Введіть першу діагональ : ");
            double d1 = sc.nextDouble();
            System.out.print("Введіть другу діагональ: ");
            double d2 = sc.nextDouble();
            System.out.println("Площа ромба: " + geometry.getRhombusArea(d1, d2));

            // --- Завдання 2: Мінімум з трьох ---
            System.out.println("\n2. Пошук найменшого з трьох чисел");
            System.out.print("Введіть 1-ше число: ");
            int n1 = sc.nextInt();
            System.out.print("Введіть 2-ге число: ");
            int n2 = sc.nextInt();
            System.out.print("Введіть 3-тє число: ");
            int n3 = sc.nextInt();

            int minResult = numberTool.findMinimum(n1, n2, n3);
            System.out.println("Найменше число: " + minResult);

            // --- Завдання 3 та 4: Робота з масивом ---
            System.out.println("\n3-4. Робота з масивом");
            System.out.print("Введіть розмір масиву: ");
            int size = sc.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Розмір масиву має бути більшим за 0!");
            }

            int[] userArray = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Елемент [" + i + "]: ");
                userArray[i] = sc.nextInt();
            }

            System.out.println("\n--- Результати для масиву ---");
            arrayTool.printArray(userArray);
            System.out.println("Найбільше число в масиві: " + arrayTool.findMaximum(userArray));

        } catch (InputMismatchException e) {
            System.out.println("\nПОМИЛКА: Введено некоректний формат даних .");
        } catch (IllegalArgumentException e) {
            System.out.println("\nПОМИЛКА ЛОГІКИ: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nКРИТИЧНА ПОМИЛКА: " + e.getMessage());
        }

        System.out.println("\nПрограму завершено .");
    }
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class TrigComplexNumber {
    protected double r;
    protected double phi;

    public TrigComplexNumber() {}

    public TrigComplexNumber(double r, double phi) {
        this.r = r;
        this.phi = phi;
    }

    public void input(Scanner scanner) {
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.print("Введіть модуль r: ");
                this.r = scanner.nextDouble();
                System.out.print("Введіть аргумент phi (у радіанах): ");
                this.phi = scanner.nextDouble();
                isValid = true; // Якщо помилок не було, виходимо з циклу
            } catch (InputMismatchException e) {
                System.out.println("Помилка: введено некоректний тип даних. Будь ласка, введіть число.");
                scanner.nextLine(); // Очищення буфера від некоректного введення
            }
        }
        scanner.nextLine(); // Очищення після успішного введення числа
    }

    public void print() {
        System.out.printf("Комплексне число: %.2f * [cos(%.2f) + i*sin(%.2f)]\n", r, phi, phi);
    }

    public TrigComplexNumber power(int n) {
        return new TrigComplexNumber(Math.pow(this.r, n), this.phi * n);
    }
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- ЗАВДАННЯ 1: Person ---
        System.out.println("=== ЗАВДАННЯ 1: Клас Person ===");
        Person person1 = new Person();
        Person person2 = new Person("Іван Франко", 45);
        person1.talk();
        person2.move();
        System.out.println("------------------------------------------");

        // --- ЗАВДАННЯ 2: Phone ---
        System.out.println("=== ЗАВДАННЯ 2: Клас Phone ===");
        System.out.print("Введіть модель телефону: ");
        String mod1 = scanner.nextLine();

        // Валідація номера через регулярний вираз (тільки цифри та можливий +)
        String num1 = readPhoneNumber(scanner, "Введіть номер телефону: ");

        // Валідація ваги через try-catch
        double w1 = readDouble(scanner, "Введіть вагу телефону (число): ");

        Phone userPhone = new Phone(num1, mod1, w1);
        System.out.println("\nРезультат створення об'єкта:");
        userPhone.printInfo();
        userPhone.receiveCall("Сервісний центр");
        userPhone.sendMessage("+380501112233", "+380674445566");
        System.out.println("------------------------------------------");

        // --- ЗАВДАННЯ 3: Фігури (Ієрархія) ---
        System.out.println("=== ЗАВДАННЯ 3: Розрахунок об'ємів фігур ===");
        Pyramid pyramid = new Pyramid(15.0, 10.0);
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        Ball ball = new Ball(7.0);

        System.out.printf("Піраміда (площа 15, вис. 10): Об'єм = %.2f\n", pyramid.getVolume());
        System.out.printf("Циліндр (радіус 5, вис. 10): Об'єм = %.2f\n", cylinder.getVolume());
        System.out.printf("Куля (радіус 7): Об'єм = %.2f\n", ball.getVolume());
        System.out.println("------------------------------------------");

        // --- ЗАВДАННЯ 4: Автомобілі (Абстракція) ---
        System.out.println("=== ЗАВДАННЯ 4: Тест-драйв автомобілів ===");
        Car sedan = new Sedan("BMW M3", "Синій", 250);
        Car truck = new Truck("MAN TGS", "Червоний", 110);

        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();
        System.out.println("------------------------------------------");

        // --- ЗАВДАННЯ 5.3 та 6: Комплексні числа ---
        System.out.println("=== ЗАВДАННЯ 5.3 та 6: Комплексні числа ===");
        ExtendedTrigComplexNumber complexNum = new ExtendedTrigComplexNumber();

        // Метод input всередині класу вже має свій try-catch для r та phi
        complexNum.input(scanner);

        System.out.println("\nВиведення даних числа:");
        complexNum.print();

        int p = readInt(scanner, "Введіть цілий степінь для піднесення: ");
        TrigComplexNumber result = complexNum.power(p);
        System.out.print("Результат піднесення: ");
        result.print();

        scanner.close();
    }


    private static String readPhoneNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.matches("^\\+?[0-9]{7,15}$")) {
                return input;
            }
            System.out.println("Помилка! Номер має містити від 7 до 15 цифр.");
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double val = scanner.nextDouble();
                scanner.nextLine(); // Очищення після числа
                return val;
            } catch (InputMismatchException e) {
                System.out.println("Помилка! Введіть число (наприклад, 150 або 150,5).");
                scanner.nextLine();
            }
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int val = scanner.nextInt();
                scanner.nextLine();
                return val;
            } catch (InputMismatchException e) {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.nextLine();
            }
        }
    }
}
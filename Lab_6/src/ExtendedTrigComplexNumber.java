import java.util.Scanner;

public class ExtendedTrigComplexNumber extends TrigComplexNumber {
    private String variableName; // Додаткове поле 1
    private String notationId;   // Додаткове поле 2

    public ExtendedTrigComplexNumber() {
        super();
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.print("Введіть ім'я змінної для числа: ");
        this.variableName = scanner.nextLine();
        System.out.print("Введіть унікальний ID: ");
        this.notationId = scanner.nextLine();
    }

    // Перевизначення методу виведення
    @Override
    public void print() {
        System.out.print("ID: [" + notationId + "] Змінна '" + variableName + "' -> ");
        super.print();
    }
}
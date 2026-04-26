import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        // Ініціалізація HashMap для зберігання пар Прізвище (Key) та Номер (Value)
        HashMap<String, String> book = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Додавання 10 сталих абонентів (метод put)
        book.put("Іваненко", "0671234567");
        book.put("Петренко", "0509876543");
        book.put("Сидоренко", "0631112233");
        book.put("Коваленко", "0974445566");
        book.put("Бондаренко", "0997778899");
        book.put("Ткаченко", "0680001122");
        book.put("Шевченко", "0953334455");
        book.put("Лисенко", "0665556677");
        book.put("Мороз", "0938889900");
        book.put("Мельник", "0982223344");
book.get("Ткаченко");
        System.out.println("Телефон ткаченка" + book.get("Ткаченко"));

        boolean running = true;

        while (running) {
            System.out.println("\n========================================");
            System.out.println("ПОТОЧНИЙ СТАН ТЕЛЕФОННОЇ КНИГИ:");
            // Виведення інформації з книги за допомогою циклу
            if (book.isEmpty()) {
                System.out.println("[Книга порожня]");
            } else {
                for (Map.Entry<String, String> entry : book.entrySet()) {
                    System.out.println("- " + entry.getKey() + ": " + entry.getValue());
                }
            }
            System.out.println("----------------------------------------");
            System.out.println("Кількість записів: " + book.size()); // метод size
            System.out.println("========================================");

            System.out.println("\nОберіть функцію:");
            System.out.println("1. Знайти номер за прізвищем (get)");
            System.out.println("2. Видалити запис за прізвищем (remove)");
            System.out.println("3. Перевірити чи є такий номер (containsValue)");
            System.out.println("4. Додати новий контакт (put)");
            System.out.println("0. Вихід");
            System.out.print("\nВаш вибір: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1": // Пошук за прізвищем
                        System.out.print("Введіть прізвище для пошуку: ");
                        String searchName = scanner.nextLine().trim();
                        if (book.containsKey(searchName)) { // метод containsKey
                            System.out.println("Результат: Прізвище " + searchName + ", номер " + book.get(searchName));
                        } else {
                            System.out.println("У книзі відсутній такий абонент."); //
                        }
                        break;

                    case "2": // Видалення довільного запису
                        System.out.print("Введіть прізвище для видалення: ");
                        String nameToRemove = scanner.nextLine().trim();
                        if (book.remove(nameToRemove) != null) { // метод remove
                            System.out.println("Запис '" + nameToRemove + "' успішно видалено.");
                        } else {
                            System.out.println("Такого прізвища не знайдено.");
                        }
                        break;

                    case "3": // Перевірка за номером
                        System.out.print("Введіть номер для перевірки: ");
                        String phoneToCheck = scanner.nextLine().trim();
                        // Валідація: перевіряємо чи введено цифри
                        if (!phoneToCheck.matches("\\d+")) {
                            throw new NumberFormatException("Номер повинен містити лише цифри!");
                        }
                        if (book.containsValue(phoneToCheck)) { // метод containsValue
                            System.out.println("Цей номер є в базі.");
                        } else {
                            System.out.println("Такого номера не знайдено.");
                        }
                        break;

                    case "4": // Додавання нового (демонстрація put)
                        System.out.print("Введіть прізвище: ");
                        String newName = scanner.nextLine().trim();
                        if (newName.isEmpty()) throw new Exception("Прізвище не може бути порожнім.");

                        System.out.print("Введіть номер: ");
                        String newPhone = scanner.nextLine().trim();
                        if (!newPhone.matches("\\d+")) throw new NumberFormatException("Тільки цифри!");

                        book.put(newName, newPhone);
                        System.out.println("Контакт додано.");
                        break;

                    case "0":
                        running = false;
                        System.out.println("Вихід з програми...");
                        break;

                    default:
                        System.out.println("Некоректний вибір. Спробуйте ще раз.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Помилка формату: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Виникла помилка: " + e.getMessage());
            }
        }
    }
}
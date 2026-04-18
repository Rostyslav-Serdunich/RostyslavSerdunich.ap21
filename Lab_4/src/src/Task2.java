public class Task2 {
    public static void main(String[] args) {
        System.out.println("--- Завдання 2 ---");
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.print("1. Перебір циклом while: ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("2. Перебір циклом for: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.print("3. Цикл while (тільки непарні індекси ): ");
        int k = 1;
        while (k < arr.length) {
            System.out.print(arr[k] + " ");
            k += 2;
        }
        System.out.println();

        System.out.print("4. Цикл for (тільки парні індекси ): ");
        for (int j = 0; j < arr.length; j += 2) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.print("5. Масив в зворотньому порядку: ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n");
    }
}
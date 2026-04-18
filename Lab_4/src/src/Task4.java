public class Task4 {
    public static void main(String[] args) {
        System.out.println("--- Завдання 4 ---");
        // Довільний масив для перевірки
        int[] arr = {2, 17, -13, 6, 22, -31, 45, 66, 100, -18};

        System.out.print("Початковий масив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Зміна знаку всіх непарних елементів
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = -arr[i];
            }
        }

        System.out.print("Масив після зміни знаку непарних елементів: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
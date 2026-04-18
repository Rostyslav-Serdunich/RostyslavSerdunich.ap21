public class Task1 {
    public static void main(String[] args) {
        System.out.println("--- Завдання 1 ---");

        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        // Заповнення масивів
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = (i + 1) * 2; // 2, 4, 6...
            oddNumbers[i] = i * 2 + 1;    // 1, 3, 5...
        }

        System.out.println("Масив 50 парних чисел:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nМасив 50 непарних чисел:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
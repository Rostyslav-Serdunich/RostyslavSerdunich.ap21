public class Task3 {
    public static void main(String[] args) {
        System.out.println("--- Завдання 3 ---");
        // Одновимірний масив дійсних чисел
        double[] arr = {1.5, -2.5, 3.2, 4.8, 10.0};
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.print("Масив дійсних чисел: ");
        for (double num : arr) System.out.print(num + "  ");
        System.out.println("\nСума елементів масиву: " + sum + "\n");
    }
}
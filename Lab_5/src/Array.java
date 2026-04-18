public class Array {
    // Завдання 3: Виводить масив у консоль
    public void printArray(int[] array) {
        System.out.print("Ваш масив: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Завдання 4: Знаходить та повертає найбільше число в масиві
    public int findMaximum(int[] array) {
        if (array.length == 0) return 0;
        int max = array[0];
        for (int x : array) {
            if (x > max) max = x;
        }
        return max;
    }
}
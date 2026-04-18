public class Number {
    // Завдання 2: Метод приймає три числа та повертає найменше
    public int findMinimum(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;


        return min;
    }
}
public class Task2_3 {
    public static void main(String[] args) {
        System.out.println("--- Завдання 2 (for) ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }

        System.out.println("\n--- Завдання 3 (while) ---");
        int h = 0;
        while (h <= 2) {
            int m = 0;
            while (m <= 59) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }
}
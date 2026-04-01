public class Task1 {
    public static void main(String[] args) {
        String phrase = "Heavy Metal !";

        System.out.println("--- Цикл for ---");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + phrase);
        }

        System.out.println("\n--- Цикл while ---");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ". " + phrase);
            j++;
        }
    }
}
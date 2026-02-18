public class Main {
    public static void main(String[] args) {
        int a1 = 10, a2 = 2, a3 = 5, a4 = 8, a5 = 12, a6 = 3, a7 = 7, a8 = 1, a9 = 4, a10 = 6;

        int sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        int diff = a1 - a2 - a3 - a4 - a5 - a6 - a7 - a8 - a9 - a10;
        int mult = a1 * a2 * a3;
        int div = a1 / a2;

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + diff);
        System.out.println("Добуток (перших трьох): " + mult);
        System.out.println("Частка (a1/a2): " + div);
    }
}
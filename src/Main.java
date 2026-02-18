public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int sum = 0;
        int diff = numbers[0];
        long mult = 1;
        double div = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (i > 0) {
                diff -= numbers[i];
                div /= numbers[i];
            }

            mult *= numbers[i];
        }

        System.out.println("--- Результати обчислень ---");
        System.out.println("Сума всіх елементів: " + sum);
        System.out.println("Різниця всіх елементів: " + diff);
        System.out.println("Добуток всіх елементів: " + mult);
        System.out.printf("Результат послідовного ділення: %.10f\n", div);
    }
}
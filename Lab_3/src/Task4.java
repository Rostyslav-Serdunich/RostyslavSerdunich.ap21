public class Task4 {
    public static void main(String[] args) {
        int h = 0, m = 0, s = 0;
        while (h <= 2) {
            System.out.println(h + " h " + m + " min " + s + " sec");
            s++;
            m++;
            if (m > 59) m = 0; // Скидання хвилин після 59
            if (s > 59) {
                s = 0;
                h++;
            }
        }
    }
}
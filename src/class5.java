public class class5 {
        public static void main(String[] args) {
            int number = 123; //

            int last = number % 10;
            int middle = (number / 10) % 10;
            int first = number / 100;

            int reversed = last * 100 + middle * 10 + first;

            System.out.println("1: " + number);
            System.out.println("2: " + reversed);
        }
    }


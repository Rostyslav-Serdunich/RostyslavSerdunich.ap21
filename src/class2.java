public class class2 {
    public static void main(String[] args) {

        String[] words = {
                "Just", "when", "I", "thought", "I", "was", "out,", "they", "pull", "me", "back", "in!"
        };

        String sentence = "";

        for (String word : words) {
            sentence += word + " ";
        }


        System.out.println("Результат:");
        System.out.println(sentence.trim());
    }
}
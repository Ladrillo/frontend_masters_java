package strings;

public class Program {
    public static void main(String[] args) {
        String str = "Hello, World! You rock.";
        System.out.println(wordCounter(str));
        System.out.println(reverse(str));
    }

    public static String wordCounter(String sentence) {
        var words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        return String.format("Your sentence has %d words", words.length);
    }

    public static String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}

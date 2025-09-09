import java.util.ArrayList;


public class AscendingCharWords {
    // 4. Знайти слова, символи в яких йдуть в порядку зростання їх кодів. На вхід поступає
    //рядок із словами. На виході – масив String.
    public static void main(String[] args) {
        String input = "";
        ArrayList<String> result = getAscendingCharWords(input);
        System.out.println("Words with ascending characters: " + result);
        System.out.println(String.join(" ", result));

    }

    public static ArrayList<String> getAscendingCharWords(String input) {
        if (input == null || input.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<String> result = new ArrayList<>();
        String[] words = input.split(" ");
        for (String word : words) {
            if (isAscending(word)) {
                result.add(word);
            }
        }
        return result;
    }

    public static boolean isAscending(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) >= word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
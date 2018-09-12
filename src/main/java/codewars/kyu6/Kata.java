package codewars.kyu6;

import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static String encrypt(final String text, final int n) {
        String result = text;
        int i = 0;
        while (i < n) {
            result = encrypt(result);
            i++;
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String result = encryptedText;
        int i = 0;
        while (i < n) {
           result = dycrypt(result);
           i++;
        }
        return result;
    }

    private static String dycrypt(String encryptedText) {
        String substring1 = "" + encryptedText.substring(0, ((encryptedText.length()) / 2));
        String substring2 = "" + encryptedText.substring(((encryptedText.length()) / 2), encryptedText.length());
        String result = "";
        for (int i = 0; i < substring2.length(); i++) {
            result = result
                    + ((i < substring2.length()) ? substring2.substring(i, i + 1) : "")
                    + ((i < substring1.length()) ? substring1.substring(i, i + 1) : "");
        }
        return result;
    }

    private static String encrypt(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> characters = text.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        addOddCharacters(stringBuilder, characters);
        addEvenCharacters(stringBuilder, characters);
        return stringBuilder.toString();
    }

    private static void addEvenCharacters(StringBuilder stringBuilder, List<Character> characters) {
        for (int i = 0; i < characters.size(); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(characters.get(i));
            }
        }
    }

    private static void addOddCharacters(StringBuilder stringBuilder, List<Character> characters) {
        for (int i = 0; i < characters.size(); i++) {
            if (i % 2 != 0) {
                stringBuilder.append(characters.get(i));
            }
        }
    }


}

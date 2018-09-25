package codewars.kyu6;

import java.util.LinkedList;
import java.util.List;

public class Conversion {

    private final List<RomanToArabic> romanToArabics = new LinkedList<>();

    public String solution(int originalArabicNumber) {
        List<RomanToArabic> romanVersusArabics = createRomanVersusArabic();
        return convertArabicNumberToRomanNumber(originalArabicNumber, romanVersusArabics);
    }

    private final List<RomanToArabic> createRomanVersusArabic() {
        romanToArabics.add(new RomanToArabic("M", 1000));
        romanToArabics.add(new RomanToArabic("CM", 900));
        romanToArabics.add(new RomanToArabic("D", 500));
        romanToArabics.add(new RomanToArabic("CD", 400));
        romanToArabics.add(new RomanToArabic("C", 100));
        romanToArabics.add(new RomanToArabic("XC", 90));
        romanToArabics.add(new RomanToArabic("L", 50));
        romanToArabics.add(new RomanToArabic("XL", 40));
        romanToArabics.add(new RomanToArabic("X", 10));
        romanToArabics.add(new RomanToArabic("IX", 9));
        romanToArabics.add(new RomanToArabic("V", 5));
        romanToArabics.add(new RomanToArabic("IV", 4));
        romanToArabics.add(new RomanToArabic("I", 1));
        return romanToArabics;
    }

    private String convertArabicNumberToRomanNumber(int originalArabicNumber, List<RomanToArabic> romanToArabics) {
        String result = "";
        int arabicRemainder = originalArabicNumber;
        for (RomanToArabic romanToArabic: romanToArabics) {
            int arabicDivider = romanToArabic.getArabicDigit();
            result = result + sameArabicDigits(romanToArabic.getRomanDigit(), arabicRemainder, arabicDivider);
            arabicRemainder = arabicRemainder % arabicDivider;
        }
        return result;
    }

    private String sameArabicDigits(String romanDigit, int arabicRemainder, int arabicDivider) {
        String romanDigits = "";
        int numberOfSameRomanDigits = arabicRemainder / arabicDivider;
        for (int i = 0; i < numberOfSameRomanDigits; i++) {
            romanDigits = romanDigits + romanDigit;
        }
        return romanDigits;
    }

    private class RomanToArabic {
        String romanDigit;
        int arabicDigit;

        public RomanToArabic(String romanDigit, int arabicDigit) {
            this.romanDigit = romanDigit;
            this.arabicDigit = arabicDigit;
        }

        public String getRomanDigit() {
            return romanDigit;
        }

        public int getArabicDigit() {
            return arabicDigit;
        }
    }

}


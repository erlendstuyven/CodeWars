package codewars.kyu7;

//a, e, i, o, and u
public class VowelCount {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}

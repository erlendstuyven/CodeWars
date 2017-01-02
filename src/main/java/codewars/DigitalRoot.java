package codewars;

public class DigitalRoot {

    public static int digital_root(int incomingNumber) {
        int root = 0;
        root = calculateDigitalRoot(incomingNumber, root);
        return  root;
    }

    private static int calculateDigitalRoot(int incomingNumber, int root) {
        for (char digit : String.valueOf(incomingNumber).toCharArray()) {
            root = root + Integer.parseInt(Character.toString(digit));
        }
        if (root > 10) {
            return digital_root(root);
        }
        return root;
    }

}
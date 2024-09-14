package Practice;

public class InverseNumber {
    public static void main(String[] args) {
        int number = 32145; // Sample input
        System.out.println("Inverse: " + getInverse(number));
    }

    public static int getInverse(int number) {
        String numStr = Integer.toString(number);
        int length = numStr.length();
        int[] inverseArr = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Place the position (i+1) at the index (digit-1)
            inverseArr[digit - 1] = i + 1;
        }

        // Construct the inverse number from the array
        StringBuilder inverseStr = new StringBuilder();
        for (int i = 0; i < length; i++) {
            inverseStr.append(inverseArr[i]);
        }

        return Integer.parseInt(inverseStr.toString());
    }
}




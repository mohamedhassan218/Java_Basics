import java.util.Arrays;

public class RadixSort {
    public static <T> void radixsort(T[] arr) {
        // Find the maximum number of digits
        int maxDigits = getMaxDigits(arr);

        // Perform counting sort for each digit position
        for (int digitPosition = 0; digitPosition < maxDigits; digitPosition++) {
            countingSort(arr, digitPosition);
        }
    }

    private static <T> void countingSort(T[] arr, int digitPosition) {
        int radix = 10; // Radix for decimal numbers
        int[] count = new int[radix];
        T[] temp = Arrays.copyOf(arr, arr.length);

        // Count the occurrences of each digit in the current digit position
        for (int i = 0; i < arr.length; i++) {
            int digit = getDigit(arr[i], digitPosition, radix);
            count[digit]++;
        }

        // Compute the starting index for each digit
        for (int i = 1; i < radix; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = getDigit(arr[i], digitPosition, radix);
            temp[--count[digit]] = arr[i];
        }

        // Copy the sorted array back to the original array
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    private static <T> int getMaxDigits(T[] arr) {
        int maxDigits = 0;
        for (int i = 0; i < arr.length; i++) {
            int numDigits = String.valueOf(arr[i]).length();
            if (numDigits > maxDigits) {
                maxDigits = numDigits;
            }
        }
        return maxDigits;
    }

    private static int getDigit(Object obj, int digitPosition, int radix) {
        String str = String.valueOf(obj);
        if (digitPosition >= str.length()) {
            return 0;
        }
        int digit = Character.getNumericValue(str.charAt(str.length() - digitPosition - 1));
        if (radix == 10 && digit < 0) {
            return 0;
        }
        return digit;
    }
}

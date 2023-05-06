import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinSort {
    public static <T extends Comparable<? super T>> void binsort(T[] arr) {
        // Find minimum and maximum values
        T min = arr[0];
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            } else if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        // Compute the range of values and the size of each bin
        double binSize = (double)(max.compareTo(min) + 1) / arr.length;

        // Create an array of empty bins
        List<List<T>> bins = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            bins.add(new ArrayList<T>());
        }

        // Insert each element into the appropriate bin
        for (int i = 0; i < arr.length; i++) {
            int binIndex = (int) Math.floor((arr[i].compareTo(min)) / binSize);
            bins.get(binIndex).add(arr[i]);
        }

        // Sort each bin and concatenate the results
        int index = 0;
        for (int i = 0; i < bins.size(); i++) {
            List<T> bin = bins.get(i);
            Collections.sort(bin);
            for (int j = 0; j < bin.size(); j++) {
                arr[index++] = bin.get(j);
            }
        }
    }
}

package training.algs.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassPhotos {

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        if (redShirtHeights.size() != blueShirtHeights.size()) {
            return false;
        }
        Integer[] reds = redShirtHeights.toArray(Integer[]::new);
        Integer[] blues = blueShirtHeights.toArray(Integer[]::new);
        Arrays.sort(reds);
        Arrays.sort(blues);
        if (reds[0].equals(blues[0])) {
            return false;
        }
        boolean redIsBigger = false;
        if (reds[0] > blues[0]) {
            redIsBigger = true;
        }

        for (int i = 0; i < reds.length; i++) {
            if (redIsBigger) {
                if (reds[i] < blues[i]) {
                    return false;
                }
            }
            else {
                if (reds[i] > blues[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

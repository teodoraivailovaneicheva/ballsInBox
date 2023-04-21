import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
//counter of colors
public class TreeMapBall {
    private static final String COLOROFBALL = "BLUE BLUE BLUE YELLOW RED RED BROWN ";

    public static void main(String[] args) {
        Map<String, Integer> colorCounts = createColorCounts(COLOROFBALL);
        printColorCount(colorCounts);
    }
    private static Map<String, Integer> createColorCounts(String color) {
        Scanner textScanner = new Scanner(color);
        Map<String, Integer> colors = new TreeMap<String, Integer>();
        while (textScanner.hasNext()) {
            String col = textScanner.next();
            Integer count = colors.get(col);
            if (count == null) {
                count = 0;
            }
            colors.put(col, count + 1);
        }
        return colors;
    }
    private static void printColorCount(Map<String, Integer> colorCounts) {

        for (Map.Entry<String, Integer> colorEntry : colorCounts.entrySet()) {

            System.out.printf("ball in '%s' is seen %d times in the box%n", colorEntry.getKey(), colorEntry.getValue());
        }
    }
}
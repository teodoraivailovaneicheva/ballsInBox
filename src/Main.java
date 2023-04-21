import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    // In a box, there's a different count of balls in different colors, which we receive as an input in the following format:
    // "Color: count", until we receive an "End" command. After that, we are allowed to remove balls from that box, but
    // we can't look at their color. We need to write a program that prints the smallest count of balls we must take out,
    // so we are sure there is only one color left in the box.

    public static void main(String[] args) {

        Ball ball1 = new Ball("blue");
        Ball ball2 = new Ball("blue");
        Ball ball3 = new Ball("blue");
        Ball ball4 = new Ball("green");
        Ball ball5 = new Ball("black");
        Ball ball6 = new Ball("red");
        Ball ball7 = new Ball("red");
        Ball ball8 = new Ball("yellow");
        Ball ball9 = new Ball("yellow");
        Ball ball10 = new Ball("white");

        List<Ball> allColorsList = Arrays.asList(ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8, ball9, ball10);
        List<Ball> blueColorList = Arrays.asList(ball1, ball2, ball3);

        ArrayList<Ball> intersectList = intersect(allColorsList, blueColorList);
        System.out.print("intersect = ");
        printList(intersectList);

    }

    public static ArrayList<Ball> intersect(List<Ball> allColorsList, List<Ball> blueColorList) {
        ArrayList<Ball> intersect = new ArrayList<Ball>();
        for (Ball ball : allColorsList) {
            if (!blueColorList.contains(ball)) {
                intersect.add(ball);
            }
        }
        return intersect;
    }

    public static void printList(ArrayList<Ball> list) {
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            count++;
        }
        System.out.println("Number of balls to get out is: " + count);
        for (Ball ball : list) {
            System.out.print(ball);
            System.out.print(" ");
        }
    }
}
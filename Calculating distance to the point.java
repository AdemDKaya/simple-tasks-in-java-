import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double x1 = 0.0, y1 = 0.0;
        final int radius = 10;

        System.out.println("Enter x2 and y2 for the point:");
        Double x2 = input.nextDouble();
        Double y2 = input.nextDouble();

        System.out.println("entered point (" + x2 + "," + y2 + ")");

        Double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("distance=" + distance);

        if (distance <= radius) {
            System.out.println("point (" + x2 + "," + y2 + ") is in the circle");
        } else {
            System.out.println("point (" + x2 + "," + y2 + ") is not in the circle");
        }
    }
}
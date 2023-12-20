import java.util.Scanner;

public class CompareDist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x1:");
        double x1 = sc.nextDouble();

        System.out.println("y1:");
        double y1 = sc.nextDouble();

        System.out.println("x2:");
        double x2 = sc.nextDouble();

        System.out.println("y2:");
        double y2 = sc.nextDouble();

        System.out.println("a1:");
        double a1 = sc.nextDouble();

        System.out.println("b1:");
        double b1 = sc.nextDouble();

        System.out.println("a2:");
        double a2 = sc.nextDouble();

        System.out.println("b2:");
        double b2 = sc.nextDouble();

        double distance1, distance2;

        Line l1 = new Line(x1, y1, x2, y2);
        Line l2 = new Line(a1, b1, a2, b2);

        distance1 = l1.lineLength();
        distance2 = l2.lineLength();

        // double sq1 = Math.pow((x1 - x2), 2);
        // double sq2 = Math.pow((y1 - y2), 2);

        // double sq3 = Math.pow((a1 - a2), 2);
        // double sq4 = Math.pow((b1 - b2), 2);

        // distance1 = Math.sqrt(sq1 + sq2);
        // distance2 = Math.sqrt(sq3 + sq4);


        Double dist1 = new Double(distance1);
        Double dist2 = new Double(distance2);
        int compare = dist1.compareTo(dist2);

        if (compare == 0)
            System.out.println("Equal");
        else if (compare < 0)
            System.out.println("Line 1 is smaller");
        else
            System.out.println("Line 2 is smaller");

        System.out.println("Distance 1: " + distance1);
        System.out.println("Distance 2: " + distance2);

    }
}
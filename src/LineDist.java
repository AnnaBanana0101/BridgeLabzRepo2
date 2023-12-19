import java.util.Scanner;

public class LineDist {
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

        double distance;

        double sq1 = Math.pow((x1 - x2), 2);
        double sq2 = Math.pow((y1 - y2), 2);

        distance = Math.sqrt(sq1 + sq2);

        System.out.println(distance);

    }
}
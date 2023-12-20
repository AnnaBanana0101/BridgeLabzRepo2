public class Line {

    public double x;
    public double y;
    public double a;
    public double b;

    public Line(double x, double y, double a, double b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public double lineLength()
    {
        double distance;

        double sq1 = Math.pow((x - a), 2);
        double sq2 = Math.pow((y - b), 2);

        distance = Math.sqrt(sq1 + sq2);

        System.out.println(distance);
        return distance;
    }

}
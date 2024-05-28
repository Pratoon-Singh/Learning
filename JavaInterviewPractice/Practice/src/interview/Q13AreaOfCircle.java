package interview;

public class Q13AreaOfCircle {
    public static void main(String[] args) {
        int radius = 3;
        double area = areaOfCircle(radius);
        System.out.println(area);
    }

    private static double areaOfCircle(int radius) {
        double area = (double) (Math.PI*radius*radius);
        return area;
    }
}

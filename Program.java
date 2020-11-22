import java.util.Scanner;

public class Program {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        Point [] points = new Point[10];
        System.out.println("Please enter 10 points (x, y): ");

        for (int i=0; i<points.length; i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            points[i]= new Point(x,y);
        }

        System.out.println("Please enter the circle center point (x, y): ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Point center = new Point(x, y);

        System.out.println("Please enter the circle radius: ");
        double radius = in.nextDouble();
        Circle circle = new Circle(center, radius);

        System.out.println("The circle contain the following points: ");

        for (int i=0; i<points.length; i++) {
            Point p = points[i];
            if (circle.containsPoint(p)) {
                System.out.println(p);
            }

        }

    }
    
}

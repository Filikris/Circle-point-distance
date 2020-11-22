public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }
     
    public Point getCenter() {
        return center;
    }

    public void setCenter (Point center) {
        this.center = center;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    boolean containsPoint (Point p) {
        return center.distanceTo(p) < r; 
    }
}

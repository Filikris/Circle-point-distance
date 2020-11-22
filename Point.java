public class Point {
    private double x, y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX (double x) {
        this.x=x;
    }

    public double getY() {
        return y;
    }

    public void setY (double y) {
        this.y=y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x-x,2) + Math.pow(p.y-y,2));
    }

    public String toString() {
        return "Point ("+x+","+y+")";
    }

}

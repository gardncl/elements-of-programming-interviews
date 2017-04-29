public class Star implements Comparable<Star> {

    private double x, y, z;

    public Star(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public int compareTo(Star rhs) {
        return Double.compare(this.distance(), rhs.distance());
    }

    @Override
    public String toString() {
        return "Star{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

public class Star implements Comparable<Star> {

    private double x, y, z;

    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public int compareTo(Star rhs) {
        return Double.compare(this.distance(), rhs.distance())
    }
}

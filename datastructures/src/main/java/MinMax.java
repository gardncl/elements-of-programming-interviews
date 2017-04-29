public class MinMax {
    public Integer min;
    public Integer max;

    public MinMax(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MinMax minMax = (MinMax) o;

        if (min != null ? !min.equals(minMax.min) : minMax.min != null) return false;
        return max != null ? max.equals(minMax.max) : minMax.max == null;
    }
}

public class Tuple {

    public Integer duplicate;
    public Integer missing;

    public Tuple() {
    }

    public Tuple(Integer duplicate, Integer missing) {
        this.duplicate = duplicate;
        this.missing = missing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple that = (Tuple) o;

        if (duplicate != null ? !duplicate.equals(that.duplicate) : that.duplicate != null) return false;
        return missing != null ? missing.equals(that.missing) : that.missing == null;
    }

}

public class BuildingWithHeight {

    public Integer id;
    public Integer height;

    public BuildingWithHeight(Integer id, Integer height) {
        this.id = id;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingWithHeight that = (BuildingWithHeight) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return height != null ? height.equals(that.height) : that.height == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}

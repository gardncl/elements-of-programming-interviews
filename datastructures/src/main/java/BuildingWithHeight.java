public class BuildingWithHeight {

    public Integer id;
    public Integer height;

    public BuildingWithHeight(Integer id, Integer height) {
        this.id = id;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        BuildingWithHeight b = (BuildingWithHeight)o;
        if ((this.id == b.id) && (this.height == b.height))
            return true;
        return false;
    }

}

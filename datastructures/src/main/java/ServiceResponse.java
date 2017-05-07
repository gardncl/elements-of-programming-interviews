import java.util.LinkedHashMap;

public class ServiceResponse {
    private LinkedHashMap<String, String[]> closest;

    public LinkedHashMap<String, String[]> getClosest() {
        return this.closest;
    }

    public void encodeIntoResponse(LinkedHashMap<String, String[]> response) {
        this.closest = response;
    }
}

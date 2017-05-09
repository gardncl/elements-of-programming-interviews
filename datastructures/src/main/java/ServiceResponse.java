import java.util.LinkedHashMap;
import java.util.List;

public class ServiceResponse {
    private LinkedHashMap<String, List<String>> closest;

    public LinkedHashMap<String, List<String>> getClosest() {
        return this.closest;
    }

    public void encodeIntoResponse(LinkedHashMap<String, List<String>> response) {
        this.closest = response;
    }
}

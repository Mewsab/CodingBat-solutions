import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");
            if (a.length() == b.length()) {
                map.put("a", "");
                map.put("b", "");
            } else {
                map.put("c", a.length() > b.length() ? a : b);
            }
        }
        return map;
    }

}

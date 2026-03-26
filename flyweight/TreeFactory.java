package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> map = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;

        if (!map.containsKey(key)) {
            map.put(key, new TreeType(name, color));
            System.out.println("Creating new TreeType: " + key);
        }

        return map.get(key);
    }
}

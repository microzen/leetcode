import java.util.HashMap;

public class AllOne {
    HashMap<String, Integer> map;
    String max;
    String min;

    public AllOne() {
        map = new HashMap<>();
    }

    public void inc(String key) {
        Integer value = 0;
        if (!map.containsKey(key)) {
            value = map.get(key) + 1;
            map.replace(key, value);
        } else {
            value = 1;
            map.put(key, value);
        }
        if (map.get(max) < value) {
            max = key;
        }
    }

    public void dec(String key) {
        Integer value = 0;
        if (!map.containsKey(key)) {
            value = map.get(key) - 1;
            if(value == 0){
                map.remove(key);
            }
            map.replace(key, value);
            if (map.get(max) < value) {
                max = key;
            }
        }

    }

    public String getMaxKey() {
        return max;
    }

    public String getMinKey() {
        return min;
    }
}

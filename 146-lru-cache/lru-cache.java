import java.util.*;

class LRUCache {
    private final int cap;
    private final LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true); // access-order
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
        if (map.size() > cap) {
            Integer lruKey = map.keySet().iterator().next(); // eldest
            map.remove(lruKey);
        }
    }
}

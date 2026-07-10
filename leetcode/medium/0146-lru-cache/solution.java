class LRUCache {
     int size ;
    //  int n = 0 ;
    // LinkedList<Integer> LRU = new LinkedList<>();
    Map<Integer,Integer> LRU = new LinkedHashMap<>(16, 0.75f, true);

    public LRUCache(int capacity) {
        size = capacity;
    }
    
    public int get(int key) {
    //    Integer ans = LRU.get(key); 
    //    if(ans == null) return -1;

    //    int res = ans;
    //    return res;
    return LRU.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
         if (LRU.containsKey(key)) {
        LRU.put(key, value);
        return;
    }

    if (LRU.size() == size) {
        int firstKey = LRU.keySet().iterator().next();
        LRU.remove(firstKey);
    }

    LRU.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
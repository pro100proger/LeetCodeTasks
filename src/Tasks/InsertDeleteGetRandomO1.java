package Tasks;

import java.util.*;

/*
        Task 12
    Implement the RandomizedSet class:
    1. RandomizedSet() Initializes the RandomizedSet object.
    2. bool insert(int val) Inserts an item val into the set if
    not present. Returns true if the item was not present, false otherwise.
    3. bool remove(int val) Removes an item val from the set if present.
    Returns true if the item was present, false otherwise.
    4. int getRandom() Returns a random element from the current
    set of elements (it's guaranteed that at least one element
    exists when this method is called). Each element
    must have the same probability of being returned.

    You must implement the functions of the class such
    that each function works in average O(1) time complexity.
 */
public class InsertDeleteGetRandomO1 {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random;


    public InsertDeleteGetRandomO1() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        return true;
    }

    public int getRandom() {
        return 1;
    }
}
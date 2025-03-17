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
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    /*
        // Code for main to test the methods
        InsertDeleteGetRandomO1 obj = new InsertDeleteGetRandomO1();
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        obj.insert(11);
        obj.insert(12);
        int val = 10;
        boolean param_1 = obj.insert(val);
        val = 17;
        boolean param_2 = obj.remove(val);
        int param_3 = obj.getRandom();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
     */
}
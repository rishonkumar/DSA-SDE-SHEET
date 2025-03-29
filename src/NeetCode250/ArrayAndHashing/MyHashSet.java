package NeetCode250.ArrayAndHashing;

import java.util.ArrayList;

public class MyHashSet {

    ArrayList<Integer> res;

    public MyHashSet() {
        res = new ArrayList<>();
    }

    public void add(int key) {
        if (!res.contains(key)) {
            res.add(key);
        }
    }

    public void remove(int key) {
        int idx = res.indexOf(key);
        if(idx != -1) res.remove(idx);
    }

    public boolean contains(int key) {
        return res.contains(key);
    }
}

//Using boolean array

class MyHashSet2 {

    private boolean[] set;
    public MyHashSet2() {
        set = new boolean[1000001]; // since key can be up to 10^6
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

package NeetCode250.ArrayAndHashing;

import java.util.*;
//https://leetcode.com/problems/top-k-frequent-elements/
//It does NOT mean elements appearing at least k times, but rather the k elements with the highest frequency.
public class TopKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer> arrays = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Use a Min-Heap (PriorityQueue) to store top k elements
        // min heap means smallest element at the top
        // add element in heap sorted by freq
        // so once heap exceeds size k means that is least frequent elemnt so remove it

        //create a min heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        //add elements to the heap
        for (int key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                //remove the least freq element
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }



    //Buckets store elements based on frequency → Index = Frequency.
    //
    //We iterate once to count frequencies, once to build buckets, and once to collect results → O(N) overall.
    //
    //No sorting is required, which is why it’s better than O(N log N).
    public int[] topKFrequentOptimized(int[] nums, int k) {

        //count the freq
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        //bucket sort
        List<Integer>[]buckets = new List[nums.length + 1];

        for(int key : freqMap.keySet()){
            int freq = freqMap.get(key);
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);  // Take elements from the most frequent bucket
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}


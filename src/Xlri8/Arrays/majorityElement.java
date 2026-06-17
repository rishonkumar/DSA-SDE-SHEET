package Xlri8.Arrays;

public class majorityElement {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int balance = 0;

        for (int n : nums) {
            if (balance == 0) {
                candidate = n;
                balance++;
            } else if (balance > 0 && candidate == n) {
                balance++;
            } else {
                balance--;
            }
        }
        return candidate;
    }

}

/*
 * The majority element appears more than half the time, so if you pair each
 * instance of the majority element with an instance of a different element, the
 * majority element will still have at least one unpaired instance left.
 * 
 * Think of it like a political vote: you start with no candidate. As you scan
 * the list of votes, you either nominate a new candidate or let them fight it
 * out, with opposing votes canceling each other.
 * 
 * The algorithm maintains just two pieces of information: a candidate (the
 * current guess for the majority element) and a count (how many net “votes”
 * that candidate has after cancellations).
 * 
 * Initialize count = 0 and candidate = none. This means no candidate currently
 * has any support.
 * 
 * Walk through the array one element at a time. For each element, first look at
 * the current count.
 * 
 * If count is zero, the current element becomes the new candidate and you set
 * count = 1. This is like saying, “No one is in the lead now, so this person
 * becomes the candidate with one vote.”
 * 
 * If count is greater than zero, compare the current element to the candidate.
 * If they are the same, increase count by one (another supporter). If they are
 * different, decrease count by one (one supporter and one opponent cancel each
 * other out).
 * 
 * Continue this for every element in the array. Each time count drops to zero,
 * the current candidate is “defeated,” and the next element will become the new
 * candidate.
 * 
 * Because the true majority element appears more than n/2 times, it will
 * survive this cancelation process. All other elements combined cannot fully
 * cancel it out, so when the scan finishes, the candidate will be the majority
 * element.
 * 
 * This algorithm runs in a single pass (O(n) time) and uses only two variables
 * (O(1) extra space), meeting the follow‑up challenge perfectly.
 */

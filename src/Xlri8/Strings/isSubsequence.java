public boolean isSubsequence(String s, String t) {
    int n = s.length();
    int m = t.length();

    int i = 0;
    int j = 0;

    while (i < n && j < m) {
        if (s.charAt(i) == t.charAt(j)) {
            i++;
        }
        j++;
    }

    return i == s.length();
}
/*

Goal – Determine whether every character of s appears in t in the same order, though not necessarily right next to each other.

Two pointers – Use one pointer, i, to track the next character we need to match in s, and another pointer, j, to scan through t.

Start at the beginning – Set both pointers to the first character: i = 0 (first character of s) and j = 0 (first character of t).

Scan t – Walk through t one character at a time using the pointer j. For each character in t, compare it with the character of s at position i.

When characters match – If t[j] equals s[i], it means we’ve found that required character in t. Move the s pointer i one step forward to look for the next character of s. Also move j forward (to continue scanning t).

When they don’t match – If t[j] is not the character we need, simply advance j to the next position in t and keep i where it is. We’re still looking for the same s[i].

Stop early if possible – If at any moment i reaches the length of s, we have matched all characters of s and can immediately return true.

Run out of t – If j reaches the end of t but i is still less than the length of s, we didn’t find all characters in the correct order.

Final check – After the loop, return true only if i equals the length of s (all matched), otherwise false.

Efficiency – This method examines each character of t at most once (O(n) time) and uses only two variables (O(1) extra space). It naturally preserves the relative order because we never move backwards in either string

*/

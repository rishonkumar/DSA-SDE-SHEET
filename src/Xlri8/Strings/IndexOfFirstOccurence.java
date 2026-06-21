public int strStr(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();

    if (m > n) return -1;

    for (int i = 0; i <= n - m; i++) {
        int j;
        for (j = 0; j < m; j++) {
            //compare character by character inside the current window
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                break;
            }
        }
        if (j == m) return i;
    }
    return -1;
}

/*
First, get the lengths of both the haystack and the needle. If the needle is longer than the haystack, it can never be found, so return ‑1 immediately.

If the needle is empty (edge case), the first occurrence is at index 0, but the problem guarantees at least one character.

The idea is to imagine a “window” the same size as the needle that moves along the haystack, starting at index 0.

The window can start at any index from 0 up to (length of haystack – length of needle). Starting beyond that would leave fewer characters than the needle.

For each starting index, compare the character at that position in the haystack with the first character of the needle. If they match, proceed to check the next characters.

Continue comparing the characters inside the window with the corresponding characters of the needle, moving one position at a time, until either a mismatch occurs or you reach the end of the needle.

If you reach the end of the needle without any mismatch, you have found a complete match. Return the current starting index.

If a mismatch occurs, immediately stop checking the rest of that window and slide the window one position to the right (increase the starting index by 1).

If you slide the window all the way to the end and no full match is found, the needle does not exist in the haystack.

The method returns either the index of the first match or ‑1 if no match was found, and it runs in O(n * m) time in the worst case, where n is the haystack length and m is the needle length. More advanced algorithms (like KMP) improve this, but the sliding window approach is the most straightforward.
*/

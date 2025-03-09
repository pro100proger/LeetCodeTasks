package Tasks;

import java.util.Arrays;

/*
        Task 11
    Given an array of integers citations where citations[i]
    is the number of citations a researcher received for
    their ith paper, return the researcher's h-index.

    According to the definition of h-index on Wikipedia:
    The h-index is defined as the maximum value of h such
    that the given researcher has published at least h
    papers that have each been cited at least h times.

    Example:
    Input: citations = [3,0,6,1,5]      Output: 3
    Explanation: [3,0,6,1,5] means the researcher has 5
    papers in total and each of them had received
    3, 0, 6, 1, 5 citations respectively.
    Since the researcher has 3 papers with at least 3
    citations each and the remaining two with no more
    than 3 citations each, their h-index is 3.
 */
public class HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int remainingPapers = n - i;
            if (citations[i] >= remainingPapers) {
                return remainingPapers;
            }
        }
        return 0;
    }

    //    //    Code for main to test the methods
    //    int[] citations = {2,9,7,3,2,6};
    //    int h = hIndex(citations);
    //    System.out.println(h);
}

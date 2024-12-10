package org.educative;

import java.util.Arrays;


public class TwoPointers {
    public static boolean isPalindrome(String s) {
        // This problem solved using two pointers
/*
Time complexity
The time complexity is O(n)O(n), where n is the number of characters in the string. However, our algorithm will only run (n/2) times, since two pointers are traversing toward each other.

Space complexity
The space complexity is O(1), since we use constant space to store two indexes.
 */
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean findSumOfThree(int[] nums, int target) {
        /*
        Time complexity: In the solution above, sorting the array takes O(nlog(n)) and the nested loop takes O(n2) to find the triplet. Here, n is the number of elements in the input array.
Therefore, the total time complexity of this solution is O(nlog(n)+n2) , which simplifies to O(n2)
Space complexity: Because we use the built-in Java function, Arrays.sort(), so the space complexity of the provided solution is O(log(n))
.
         */
        Arrays.sort(nums);
        int low = 0;
        int high = 0;
        for(int i = 0; i < nums.length - 2; i++ ) {
            low = i + 1;
            high = nums.length - 1;
            while(low < high) {
                int triples = nums[i] + nums[low] + nums[high];
                if(triples == target) {
                    return true;
                } else if(triples < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return false;
    }
}




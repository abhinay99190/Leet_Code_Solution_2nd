/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.

Example 1:--
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:--
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.


Constraints:--
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 */

import java.util.ArrayList;
public class Solution {
    public static int findKthPositive(int[] arr, int k) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            int start = 1;
            for (int i = 0; i < arr.length; i++) {
                arr1.add(i,arr[i]);
            }
            while (k>0){
                if ((arr1.contains(start))){
                    start++;
                }else {
                    start++;
                    k--;
                }
            }

            return start-1;
        }
        public static void main(String[] args) {
            int []arr = {2,3,4,7,11};
            int k = 5;
            System.out.println(findKthPositive(arr,k));
        }
}

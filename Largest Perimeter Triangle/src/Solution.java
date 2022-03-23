/*
Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these
lengths. If it is impossible to form any triangle of a non-zero area, return 0.

Example 1:--
Input: nums = [2,1,2]
Output: 5

Example 2:--
Input: nums = [1,2,1]
Output: 0

Constraints:--
3 <= nums.length <= 104
1 <= nums[i] <= 106
 */

import java.util.Arrays;


public class Solution {
    public static int largestPerimeter(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i <= nums.length-3; i++) {
            if (nums[i]<nums[i+1]+nums[i+2]){
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []nums = {3,6,2,3};
        System.out.println(largestPerimeter(nums));
    }
}

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it
can trap after raining.

Example 1:--
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case,
6 units of rain water (blue section) are being trapped.

Example 2:--
Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:-
n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
 */

public class Solution {
    public static int trap(int[] height) {
        int total_water = 0;
        for (int i = 0; i < height.length; i++) {
            int left_max = leftmax(height, i);
            int right_max = rightmax(height,i);
            total_water+= Math.min(left_max,right_max) - height[i];
        }
        return total_water;
    }

    public static int rightmax(int[] height, int i) {
        int maximum = 0;
        for (int j = height.length-1; j >= i ; j--) {
            maximum = Math.max(maximum,height[j]);
        }
        return maximum;
    }

    public static int leftmax(int[] height, int i) {
        int maximum = 0;
        for (int j = 0; j <= i; j++) {
            maximum = Math.max(maximum,height[j]);
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}

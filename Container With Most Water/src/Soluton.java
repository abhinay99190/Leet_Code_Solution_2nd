/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the
ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water
(blue section) the container can contain is 49.

Example 2:--
Input: height = [1,1]
Output: 1


Constraints:--
n == height.length
2 <= n <= 105
0 <= height[i] <= 104

 */
public class Soluton {
    public static int maxArea(int[] height) {
        int first_pointer = 0;
        int second_pointer = height.length-1;
        int maxArea = 0, area;
        int minwall,lwall,rwall;
        while (first_pointer<second_pointer){
            lwall = height[second_pointer];
            rwall = height[first_pointer];
            minwall = Math.min(lwall, rwall);
            area = minwall*(second_pointer-first_pointer);
            if (area>=maxArea){
                maxArea=area;
            }
            if (height[first_pointer]<height[second_pointer]){
                first_pointer++;
            }else {
                second_pointer--;
            }

        }
        return maxArea;
    }
    public static void main(String[] args) {
        int []height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}

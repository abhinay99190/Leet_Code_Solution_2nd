/*
Given an array of integers nums, sort the array in ascending order.

Example 1:--
Input: nums = [5,2,3,1]
Output: [1,2,3,5]

Example 2:--
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]

Constraints:--
1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
 */
import java.util.Arrays;
public class Solution {
    public static int[] sortArray(int[] nums) {
        if (nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return sort(left,right);
    }

    public static int[] sort(int[] first, int[] second) {
        int[] mix = new int[first.length+ second.length];
        int i=0,j=0,k=0;
        while (i< first.length&&j< second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not completed
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int []nums = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}

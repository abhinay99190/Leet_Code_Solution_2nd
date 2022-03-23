
public class Soluton1 {
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
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int []height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}

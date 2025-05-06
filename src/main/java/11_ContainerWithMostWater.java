/*
* https://leetcode.com/problems/container-with-most-water/
* */

class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int arrLength = height.length, square = 0;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                int length = j - i;
                square = Math.max(square, Math.min(height[i], height[j]) * length);
            }
        }
        return square;
    }

    public int maxAreaOptimized(int[] height) {
        int square = 0, i = 0, j = height.length - 1;
        while (i < j) {
            int length = j - i;
            square = Math.max(square, Math.min(height[i], height[j]) * length);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return square;
    }
}

package Arrays;

/**
 * @BelongsProject: ShuaTi
 * @BelongsPackage: Arrays
 * @Author: qzk
 * @CreateTime: 2024/2/28 22:26
 * @Description: TODO
 * @Version: 1.0
 */
public class LC704BinarySearch {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        new Solution().search(nums,9);
    }
    static class Solution {
        public int search(int[] nums, int target) {
            int length = nums.length;
            int left = 0;
            int right = length - 1;
            while (left <= right) {
                int mid = left + (right - left)/2;
                if (nums[mid] < target) {
                    left = mid + 1;
                }
                else if (nums[mid] > target) {
                    right = mid - 1;
                }
                else return mid;
            }
            return -1;
        }
    }
}

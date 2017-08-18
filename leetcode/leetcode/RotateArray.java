/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
[5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different
ways to solve this problem.

[show hint]

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 1; i < nums.length; ++i) {
            nums[len - 1 - (i - 1) * k % len] = nums[len - 1 - i * k % len];
        }
        nums[k - 1] = tmp;
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target) {
                left++;
            }else{
                break;
            }
        }
        return new int[]{left+1, right+1};
        
    }
}

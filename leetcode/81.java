class Solution {
    public boolean search(int[] nums, int target) {
        boolean inArr=false;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                inArr=true;
            }
        }
        return inArr;
    }
}
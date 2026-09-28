class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numHash = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            if (numHash.contains(nums[i]))
                return true;
            else
                numHash.add(nums[i]);
        }
        return false;
    }
}
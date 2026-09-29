class Solution {

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0)
            return 0;
        int st = 0, end = length-1;
        while(st < end){
            if (nums[st] == val){
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                end--;
            }
            else
                st++;
        }
        if (nums[st]!= val)
            return st+1;
        else
            return st;
        
    }
}
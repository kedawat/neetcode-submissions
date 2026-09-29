class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int count=0, zeroIdx = -1, prod=1;
        for(int i=0;i<len;i++){
            if (nums[i] == 0){
                count++;
                zeroIdx = i;
            }
            else{
                prod *= nums[i];
            }
        }

        int [] res = new int[len];
        Arrays.fill(res, 0);
        
        if (count == 0){
            for(int i=0;i<len;i++){
                res[i] = prod/nums[i];
            }
        }
        else if(count == 1){
            res[zeroIdx] = prod;
        }

        return res;
        
    }
}  

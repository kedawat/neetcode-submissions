class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        // int count=0, zeroIdx = -1, prod=1;
        // for(int i=0;i<len;i++){
        //     if (nums[i] == 0){
        //         count++;
        //         zeroIdx = i;
        //     }
        //     else{
        //         prod *= nums[i];
        //     }
        // }

        // int [] res = new int[len];
        // Arrays.fill(res, 0);
        
        // if (count == 0){
        //     for(int i=0;i<len;i++){
        //         res[i] = prod/nums[i];
        //     }
        // }
        // else if(count == 1){
        //     res[zeroIdx] = prod;
        // }

        // return res;

        int []res = new int[len];

        res[0] =1;
        for(int i=1;i<len;i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int postfix = 1;
        for(int i=len-1;i>=0;i--){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        
        return res;
    }
}  

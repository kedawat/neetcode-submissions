class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] res = new int[2];

        int length = numbers.length;
        for(int i=0,j=length-1; i<j;){
            if (numbers[i] == target - numbers[j]){
                res[0] = i+1;
                res[1] = j+1;
                break;
            }
            else if (numbers[i] > target- numbers[j])
                j--;
            else
                i++;
       }

       return res;

    }
}

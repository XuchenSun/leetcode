//1480
class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] result=new int[nums.length];// create a new instance of int array
        int current_sum=0; // initialize the summation of array
        for(int i=0;i<nums.length;i++){// create a loop to push the result one by one
            current_sum=current_sum+nums[i]; //get the result of sum
            result[i]=current_sum;// add the result to array one by one
        }
        
        return result;// return the result
        
    }
}

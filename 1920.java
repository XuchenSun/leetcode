class Solution1920 {
    public int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];// define a new array according to input nums
        //System.out.print(nums.length);// check length
        int current=0;//define a int to get the current index
        for(int i=0;i<nums.length;i++){// use loop to get the result
            current=nums[i];
            result[i]=nums[current];
        }
        
        
        return result;
    }
}

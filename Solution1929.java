//1929 Logic: use two loop to add int to the result array one by one
class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result=new int[nums.length*2];
        
        for(int i=0;i<nums.length;i++){// first loop
            result[i]=nums[i];
        }
          for(int j=0;j<nums.length;j++){//second loop
            result[nums.length+j]=nums[j];
        }
        
        return result;
    }
}

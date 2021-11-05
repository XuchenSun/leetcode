//2006 two loop
class Solution {
    
    public int getValue(int x){
        if(x<=0){return -x;}
        else return x;
    }
    
    
    public int countKDifference(int[] nums, int k) {
        int result=0;
        int current=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                current=nums[j]-nums[i];
                current=getValue(current);
                if(current==k){result++;}
                
            }
        }
        
        
        return result;
    }
}

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        int re=nums[0]+nums[1]+nums[2];
        int oldDifferent=Math.abs(re-target);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    int cur=nums[i]+nums[j]+nums[k];
                    int newDifferent=Math.abs(cur-target);
                    if(cur==target){return target;}
                    if(oldDifferent>newDifferent){
                        re=cur;
                        oldDifferent=newDifferent;
                    }
                }
            }
        }
        return re;
    }
}

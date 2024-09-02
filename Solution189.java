class Solution189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        int move=k%n;
        for(int i=0;i-move<0;i++){
            nums[i]=temp[i+n-move];
        }
        for(int i=move;i<n;i++){
            nums[i]=temp[i-move];
        }
    }
}
import java.util.Arrays;

// 4  three step 1 create array 2 sort array 3 get the median
class solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
      // super easy to understand
      // create array
        int[] merged_arry=new int[nums1.length+nums2.length];
        
        
        for(int i=0;i<nums1.length;i++){
            merged_arry[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merged_arry[nums1.length+j]=nums2[j];
        }
        
        // sort array
        Arrays.sort(merged_arry);
        
 
            
        
        // get the median
        int t_index=merged_arry.length;
        
   
        
        if(t_index%2==0){
            float result=(merged_arry[t_index/2]+merged_arry[t_index/2-1]);
            
            return result/2;
        }
        
        
        else {
            return (float)(merged_arry[(t_index-1)/2]);
        }
        
        
    }
}

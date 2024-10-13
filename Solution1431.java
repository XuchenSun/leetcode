import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1431 {

    public static void main(String[] args){
        Solution1431 solution1431=new Solution1431();

        int[] input=new int[]{2,3,5,1,3};
        List<Boolean> q=solution1431.kidsWithCandies(input,3);
        System.out.println(q);
    }
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            // get the max candies
            int[] copy=Arrays.copyOf(candies,candies.length);

            //Primitive types are the most basic data types available within the Java language.
            // There are 8: boolean , byte , char , short , int , long , float and double .
            // These types serve as the building blocks of data manipulation in Java.

            Arrays.sort(copy);
            int max=copy[copy.length-1];

            // compare and get result list
            List<Boolean> result=new ArrayList<>();
            for(int i=0;i<candies.length;i++){
                if((candies[i]+extraCandies)>=max){result.add(true);}
                else{result.add(false);}
            }


            return result;
        }

}

public class s605 {

        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            // get the max n from flowerbed
            int maxN=0;

            //n==1
            if(flowerbed.length==1&flowerbed[0]==0&n==1){
                return true;
            }
            //n==2
            if(flowerbed.length==2&n==1){
                if(flowerbed[0]==0&flowerbed[1]==0){return true;}

            }

            //n==3
            if(flowerbed.length==3&n==2){
                if(flowerbed[0]==0&flowerbed[1]==0&flowerbed[2]==0){return true;}

            }

            //n>=4
            for(int i=1;i<flowerbed.length-1;i++){

                if(flowerbed[0]==0&flowerbed[1]==0){
                    maxN++;
                    flowerbed[0]=1;
                    continue;
                }
                if(flowerbed[flowerbed.length-1]==0&flowerbed[flowerbed.length-2]==0){
                    maxN++;
                    flowerbed[flowerbed.length-1]=1;
                }

                if(flowerbed[i]==1){continue;}

                if(flowerbed[i]==0){
                    if((flowerbed[i-1]==0)&(flowerbed[i+1]==0)){
                        maxN++;
                        flowerbed[i]=1;

                    }
                }
            }


            // compare it with n
            return (maxN>=n)? true:false ;

        }

}

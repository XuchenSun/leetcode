public class S345_Second_solution {

        public String reverseVowels(String s) {

            char[] ch=s.toCharArray();

            int start=0;
            int end=s.length()-1;
            String vowels="aeiouAEIOU";
            // how to determine if a char belong to vowels or not
            // vowels.indexOf(word[i])==-1   if vowels's index of word[i] equal to a number which is not -1, the word[i] match a char in vowels.

            //two pointers
            while(start<end){
                //move left pointer until a vowel exist
                while(start<end&&vowels.indexOf(ch[start])==-1){
                    start++;
                }

                //move right pointer until a vowel exist
                while(start<end&&vowels.indexOf(ch[end])==-1){
                    end--;
                }

                //Swap the vowels
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;

            }

            return String.valueOf(ch);



        }

}

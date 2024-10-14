import java.util.HashMap;

public class s345 {

        public String reverseVowels(String s) {
            // get Vowels and location
            HashMap<Integer,Character> hashMap=new HashMap<>();
            char[] ch = new char[s.length()];

            for (int i = 0; i < s.length(); i++) {
                ch[i] = s.charAt(i);
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                    hashMap.put(i,ch[i]);
                }
            }


            // reverse vowels
            Character[] reverse=new Character[hashMap.size()];
            int j=0;

            for (int i = 0; i < s.length(); i++) {
                ch[i] = s.charAt(i);
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                    reverse[j]=s.charAt(i);
                    j++;
                }
            }
            int l=reverse.length;
            // if size  %2==0
            if(l%2==0){
                for(int i=0;i<l/2;i++){
                    char temp=reverse[i];
                    reverse[i]=reverse[l-1-i];
                    reverse[l-1-i]=temp;
                }
            }

            // if size %2==1
            if(reverse.length%2==1){
                for(int i=0;i<l/2;i++){
                    char temp=reverse[i];
                    reverse[i]=reverse[l-1-i];
                    reverse[l-1-i]=temp;
                }
            }

            // put reverse vowels  into string according to location

            int k=0;
            for (int i = 0; i < s.length(); i++) {
                ch[i] = s.charAt(i);
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                    ch[i]=reverse[k];
                    k++;
                }
            }



            return String.valueOf(ch);



        }

}

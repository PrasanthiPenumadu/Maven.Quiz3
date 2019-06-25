package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        int count=0;
        int count1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                count++;
        }
        int k=str.length();
        String[] string1=new String[str.length()];
        while(count1<count){
            for(int i=0;i<str.length();i++){
                string1[i]= str.substring(0,i)+str.substring(i, i+1).toUpperCase()+str.substring((i+1),k);
                count1++;

            }}
        return string1;
    }
}

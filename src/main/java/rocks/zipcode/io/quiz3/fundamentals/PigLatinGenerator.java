package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        int index=0;
        String[] strArray=str.split("");
        if(isVowel(str.charAt(0)))
            return (str+"way");

        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                index=i;
                break;
            }
        }
        return str.substring(index)+str.substring(0,index)+"ay";
    }
    boolean isVowel(char c) {
        return (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||
                c=='U'||c=='u');
    }
}

package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i)));{
                return true;}
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i=0;i<word.length();i++){
            if(isVowel(word.charAt(i)))
                return i;}
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if(isVowel(word.charAt(0)))
            return true;
        return null;
    }

    public static Boolean isVowel(Character character) {

        if(isVowel(character))
            return true;
        return null;
    }
    public static boolean isVowel(char c) {
        return (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||
                c=='U'||c=='u');
    }
}

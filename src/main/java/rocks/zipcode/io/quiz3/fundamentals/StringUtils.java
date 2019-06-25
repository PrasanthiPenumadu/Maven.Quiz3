package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String s=str.substring(0,indexToCapitalize)+str.substring(indexToCapitalize, indexToCapitalize+1).toUpperCase()+str.substring(indexToCapitalize+1);
        return s ;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.charAt(indexOfString)==characterToCheckFor)
            return true;
        else
            return false;
    }

    public static String[] getAllSubStrings(String string) {
        int count=0;
        for(int i=0;i<string.length();i++){
            for(int j=i+1;j<=string.length();j++){
                string.substring(i, j);
                count++;
                System.out.println( string.substring(i, j));
            }
        }
        String[] array =new String[count];
        int k=0;
        for(int i=0;i<string.length();i++){
            for(int j=i+1;j<=string.length();j++){
                array[k]=string.substring(i, j);
                k++;
                System.out.println( string.substring(i, j));
            }
        }
        return array;
    }

    public static Integer getNumberOfSubStrings(String input){
        int count=0;//input.length()-1;
        for(int i=0;i<input.length()-1;i++){
            for(int j=i+1;j<=input.length();j++){
                input.substring(i, j);
                count++;
            }
        }

        return count;
    }
}

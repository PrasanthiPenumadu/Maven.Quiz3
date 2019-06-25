package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Integer count=0;
        SomeType k=null;
        for(SomeType i:array){
            count=0;
            for(SomeType j:array){
                if(i==j)
                    count++;}
            if(count%2==1)
                k=i;
        }

        return k;
    }

    public SomeType findEvenOccurringValue() {
        Integer count=0;
        SomeType k=null;
        for(SomeType i:array){
            count=0;
            for(SomeType j:array){
                if(i==j)
                    count++;}
            if(count%2==0)
                k=i;
        }

        return k;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count=0;
        for(SomeType i:array){
            if(i==valueToEvaluate)
                count++;
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> al=new ArrayList<>();//=Arrays.asList(array);
        for(SomeType i:array)
        {
            if(predicate.apply(i))
                al.add(i);
        }
        return al.toArray(Arrays.copyOf(array, al.size()));
    }
}

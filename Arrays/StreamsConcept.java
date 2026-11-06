import java.util.*;
import java.util.stream.Stream;

public class StreamsConcept{
    public static void main(String[] args){
    List<Integer> ls= new ArrayList<>();
for(int i=0;i<10;i++){
    ls.add(i);
    }
System.out.println(ls);

Stream<Integer> str=ls.stream();
System.out.println(str);
str.filter(n->n%2==0)
   .forEach(System.out::println);
}

}
import java.util.*;

public class DuplicateCharactersInWord{
    public static Map<Character,Integer> duplicateCharacterFinder(String word){
       Map<Character, Integer> freqMap=new HashMap<>();
       if(word ==null || word.trim().isEmpty()){ return freqMap;}
       word=word.trim();
        char[] chArray=word.toCharArray();
        for(char c :chArray ){
            if(c==' '){continue;}
            if(freqMap.containsKey(c)){
                freqMap.put(c,freqMap.get(c)+1);
            }
            else{
                freqMap.put(c,1);
            }
        }
        return freqMap;
    }

    public static void main(String [] args){
        String input="Shivaam";
        Map<Character,Integer> duplicateFreq=duplicateCharacterFinder(input);
        for(Map.Entry<Character,Integer> entry :duplicateFreq.entrySet()){
            System.out.println(entry.getKey()+">>>>>>>>"+entry.getValue());
        }
    }
}
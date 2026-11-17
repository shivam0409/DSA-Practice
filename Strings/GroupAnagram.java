import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] arr){
        if(arr==null || arr.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> freqMap=new HashMap<>();
        for(String s:arr){
            int[] freq=new int[128];
            char[] ch =s.toCharArray();
            for(char c:ch){
                freq[c]++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:freq){
                sb.append(i).append('*');
            }

            String freqKey=sb.toString();

            if(freqMap.containsKey(freqKey)){
                freqMap.get(freqKey).add(s);             
            }
            else{
                List<String> ls=new ArrayList<>();
                ls.add(s);
                freqMap.put(freqKey,ls);
            }
            
        }
     return new ArrayList<>(freqMap.values());

    }

    public static void main(String[] args){
       List<List<String>> ls= groupAnagram(new String[]{"eat","tea","ram","mar","char"});
       System.out.print(ls);
    }
    
}

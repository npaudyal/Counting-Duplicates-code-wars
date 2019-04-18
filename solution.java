
// This is how i did it! I had been practicing hashmaps thats why I did this using hashmaps which is totally unnecessary.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class CountingDuplicates {
  public static int duplicateCount(String text) {
  String myString="";
  int n=0;
    // Write your code here
    Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
        text=text.toLowerCase();
        char[] chrs = text.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                myString+=ch;
            }
            }
            return myString.length();
            }
            }
            
            
   
   
   // This is one short and clever way to do this.
   public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
            
            
            
        
    

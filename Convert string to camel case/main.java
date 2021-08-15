
import java.lang.StringBuilder;
import java.util.ArrayList;

class Solution{

  static String toCamelCase(String s){
    
    
       String word = s;
       String newWord = "";
       String finalWord = "";
       
       ArrayList<Character> chars = new ArrayList<Character>();
       
       for(int i = 0; i < word.length(); i++){
           
        chars.add(word.charAt(i));   
           
       }
       
       
       for(int j = 0; j < chars.size(); j++){
           
           
           char symbol = chars.get(j);
           if(symbol == '-' || symbol == '_'){
               int nextIndex = j+1;
               char nextLetter = chars.get(nextIndex);
               char uppercase = Character.toUpperCase(nextLetter);
               chars.set(nextIndex,uppercase);
           }
           
         
       }
       
       for(int k = 0; k < chars.size(); k++){
           
           newWord += chars.get(k);
           
       }
       
       
       for(int l = 0; l < newWord.length(); l++){
           
           if(newWord.charAt(l) == '_'){
              finalWord = newWord.replaceAll("_","");
           }
           
           
           
           if(newWord.charAt(l) == '-'){
             finalWord =  newWord.replace("-","");
           }
       }
       
       
       
     //  System.out.println(finalWord);
    
    
    
    
    return finalWord;
  }
}

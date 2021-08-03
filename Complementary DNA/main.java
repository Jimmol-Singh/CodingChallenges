public class HelloWorld{

     public static void main(String []args){
        String sentence = "GTAT";
        char[] ch = new char[sentence.length()];
         for (int i = 0; i < sentence.length(); i++) {
            ch[i] = sentence.charAt(i);
        }
        
        
        
        for (int i = 0; i < ch.length; i++) {
            
            
            if(ch[i] == 'A'){
                ch[i] = 'T';
            }
            
            else if(ch[i] == 'T'){
                ch[i] = 'A';
            }
            
            else if(ch[i] == 'C'){
                ch[i] = 'G';
            }
            
            else if(ch[i] == 'G'){
                ch[i] = 'C';
            }
            
            
            
            
            
        }
        
        
        
        String newSent = "";
        
         for (int i = 0; i < ch.length; i++) {
             
             newSent += ch[i];
             
         }
         
         
         System.out.println(newSent);
        
    

     }
}

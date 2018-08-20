// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock
import java.util.*;

// INPUT a+(b*c)+{[j]*{d*c}({[w+s]})}
// check if parenthesis are balanced 

class Main {
    
    private  static Map<Character, Character> 
        parenthesisMap = new HashMap<Character,Character>(); 
    private static Set<Character> closingParenthesisSet = new HashSet<Character>();    
    
    static{
        parenthesisMap.put('{','}');
        parenthesisMap.put('(',')');
        parenthesisMap.put('[',']');
        closingParenthesisSet.addAll(parenthesisMap.values());
    }
    
    public static void main(String[] args) {
        System.out.println("is Balanced="+checkParenthesis( "a+(b*c)+{[j]*{d*c}({[w+s]})}"));
        
        System.out.println("is Balanced="+checkParenthesis( "a+(b*c+{[j]*{d*c}({[w+s]})}"));
        
    }
    
    public static boolean checkParenthesis(String inputStr){
        boolean isBalanced = false ;
        try{
        if(inputStr == null ){
            return true ;
        }
        Stack<Character> openingParenthesis = new Stack<Character>();
        char[] charArray = inputStr.toCharArray();
        
        for(char c: charArray){
            if(closingParenthesisSet.contains(c)){
                char closingParenthesisChar = openingParenthesis.pop();
            }
            if( parenthesisMap.get(c) != null){
                openingParenthesis.push(c);
            }
        }
        return openingParenthesis.isEmpty();
        }catch(Exception ex){
            
        }
        return isBalanced;
    }
}


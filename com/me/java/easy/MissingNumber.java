import java.util.*;
// Write a program for Two Sum 
// https://codebunk.com/b/977233628/ 

// How do you find the missing number in a given integer array of 1 to 10?

class Main {
  
    public static void main(String[] args) {
        int[] numbers = new int[] {5,2,7,1,6,3,8,9,10};
        int missingNumber =  findMissingNumber(numbers, 10);
        System.out.println(" missingNumber="+missingNumber);
    }
    
    public static int findMissingNumber(int[] numbers , int maxNumber){

        // Null check 
        if(numbers == null) return 0; 
      
        int totalSum = 0 ; 
        int totalNumberSum = 0 ; 
        for(int idx=0; idx <= maxNumber ; idx++ ){
            totalSum += idx ;          
          }  

        for(int id=0; id < numbers.length ; id++ ){
            totalNumberSum += numbers[id] ;          
          }  
        System.out.println(" totalSum="+totalSum+", totalNumberSum="+totalNumberSum);
        
        return (totalSum-totalNumberSum);
    }

    
    
}

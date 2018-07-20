import java.util.*;
// Write a program for Two Sum 
// https://codebunk.com/b/977233628/ 
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice. 

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int[] numbers = new int[]{3,2,4};
        int target = 6 ; 
        int[] resultNumber = twoSum(numbers , target);
        
        for(int idx = 0 ; idx < resultNumber.length ; idx ++){
            System.out.println(resultNumber[idx]+",");
        }
    }
    
    public static int[]  twoSum(int[] array , int target){
        int maxIndex = 2 ;
        int[] resultNumber = new int[maxIndex];
        int index = 0 ;
        Map<Integer, Integer> numbersMap = new HashMap();
        for(int idx =0 ; idx < array.length ; idx++){
            numbersMap.put(array[idx],array[idx]);
        }
        
        for(int idx =0 ; idx < array.length ; idx++){
            Integer pairNum = null ;
            if(target > array[idx]){
                pairNum = numbersMap.get(target-array[idx]);
                if((target/2)==pairNum){
                    pairNum = null;
                }
            }
            if(pairNum != null && index <maxIndex){
                resultNumber [index] = idx;
                index++;
            }
        }
        return resultNumber;
        
    }
    
    
}


import java.util.*;

// Write a simple Java Iterator  
// https://codebunk.com/b/977233628/ 

class ArrayIterator {
  
    public static void main(String[] args) {
        String[] numbers = new String[] {"5","2","7","1","6","3","8","9","10"};
        Arrays arrs = new Arrays(numbers);
        while(arrs.hasNext()){
        
           System.out.println(arrs.getCurrent()+"<==>"+arrs.getNext());
        }
        System.out.println(" numbers="+numbers);
    }
    
    public static class Arrays<T> {
        private T[] arr ;
        int current = 0 ; 
        
        public Arrays(T[] arr){
            this.arr = arr;
        }
        
        public boolean hasNext(){
            
             if(arr.length <= current){
               return false;
             }else{
                return true ;  
             }
            
        }
        
        public T getNext(){
            if(!hasNext()){
                 throw new NoSuchElementException();
            }
            
            return arr[current++];
        }
        
        public T get(int index ){
               return arr[index];
        }
        
        public void set(T data, int index ){
                arr[index] =data;
                
        }
        
        public int getCurrent(){
            return current ;
            
        }
        
       
    }
    
    
}

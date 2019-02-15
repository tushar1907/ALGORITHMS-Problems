import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Jumps {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int steps = 0;
        int i=0;                
        for(i=0;i<c.length;i++){
    	   
    	   if(i != c.length-2 && i != c.length-1) {
    		   if(c[i+2]==0){
                   steps++;
                   i = i+1;
               }else{
                   steps++;                   
               }
    	   }else if(c[i+1]==0) { 
    		   steps++; 
    		   return steps;
    	   }
            
        }        
       return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int[] c = new int[]{0,0,0,1,0,0};      
        
        
        int result = jumpingOnClouds(c);
 
        System.out.println(result);
    }
}

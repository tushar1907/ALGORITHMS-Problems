import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedStr {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        
        String newStr = "";
        for(int i=0;i<=n;i++){
            newStr = newStr + s;
        }     
        
        
        int count = 0;
        newStr = newStr.substring(0,(int) (n+1));
        for(int i=0; i<newStr.length(); i++){
            if(newStr.charAt(i)=='a'){
                count++;
            }
        }
        
        return(count);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        long result = repeatedString("a", 100000000);

        System.out.println(result);

        scanner.close();
    }
}

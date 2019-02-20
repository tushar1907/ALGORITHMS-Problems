import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStr {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

    	String yes = "YES";
        String no = "NO";
        HashMap<Integer, String> source = new HashMap<Integer,String>();
        String[] string1 = s1.split("");
        String[] string2 = s2.split("");
        for(int i=0;i<string1.length;i++){
            source.put(i,string1[i]);
        }

        
            for(int i=0;i<string2.length;i++){
                for (int key : source.keySet()) {                	
                    if(source.get(key).equals(string2[i])){
                        return yes;
                    }
            }
        }
        return no;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      

            String result = twoStrings("wouldyoulikefries", "abcabcabcabcabcabc");
            System.out.println(result);
    }
}

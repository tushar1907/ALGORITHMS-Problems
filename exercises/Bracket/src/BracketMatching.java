import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BracketMatching {

    // Complete the isBalanced function below.
    static String isBalanced(String s1) {

        Stack<Character> stack = new Stack<Character>();
        char[] s2 = s1.toCharArray();
        
            for(char s: s2){
                if(s == '(' || s == '{' || s == '['|| s == ' ' ){
                    stack.push(Character.valueOf(s));
                }else if(!stack.empty() && ((Character.valueOf(s) == ')' && stack.peek() == '(')
                ||(Character.valueOf(s) == '}' && stack.peek() == '{')
                ||(Character.valueOf(s) == ']' && stack.peek() == '[')
                ||(Character.valueOf(s) == ' ' && stack.peek() == ' '))){
                    stack.pop();
                }else return "NO";
            }
        
        

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String result = isBalanced("}([[{)[]))]{){}[");
        System.out.println(result);
//        for (int tItr = 0; tItr < t; tItr++) {
//            String s = scanner.nextLine();
//
//            String result = isBalanced(s);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

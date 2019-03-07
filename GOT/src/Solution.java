import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {

        char[] c = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(char cT: c){
            if(map.containsKey(cT)) map.put(cT,map.get(cT)+1);
            else map.put(cT,1);
        }
        int count = 0;
        
        if(map.size()%2==0){
            for(char cT: map.keySet()){
                if((map.get(cT)+1)%2!=0){
                    return "NO";                
                }
            }
            return "YES";
        }else{
            for(char cT: map.keySet()){
                if(map.get(cT)%2!=0){
                    count++;                
                }
            }
        }
        
        if(count==1){
            return "YES";
        } else return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();
        
        String result = gameOfThrones("jpodjyldupelpggxcrmngnmvuabiponaeedpcqsxfxkwfqukkixsvjnrmozddpdjtgyvyqugpfcvxyfjhcceopwcexfjokshqsfqizwagzvgzcpggtnwjlypkfyzpsihknyupwuvxrdxvvfeouaxfbmqimpagxhsnhpcglxdfdcayigmchmkkyaunruvqcodlfhrqhxvkzyijewmniwzjyuwrothsjngowxhdwcnwcxfhwtwepwnpslgghqbqfhfbgofdsuzvueeqaawpymhqxnzefaxkjeopstskprflylbymypmmyfjmeqtgpgptuelpxveqdqqotqctgpfewrsajoiyuxrodedcbjvebltvexqkmwqiplkyzuyvtrlxvqbwzwbdkwaotqaiossdffdgzdbtumspcvoeurhepjuizwsqqlvwsbcteemzsgqxcebwxkcmtyvuupmkciiujloprcojlhgnnjlltnxolulhkxtofcjqnzggbwrmdabrjmefbbtoyeviepylrhcgikmmidyodchpqlusopgmwewavvlmepunbizmlzarbjiuucmktuxpatrvqfjvwdialjmziosmxagtcudxqcnrwgmolwjkbtkncwolmgzjgfekbhhrkwiifxwqvicwbmlgkzrwfsfnxjxathrddcnibjbwtdsvsebcduzlmgylswnnfesiiftjqwfkbyhtekyjezushvfbtsoyygghnbqezwqbwxwcjulnvihddmewgvuebclrgcvfangwmfavblkxvrcyfgwlbsrfvdwbhtihirfuwfrxsbwouymzhlmkddpaindpimyqddmbidadgxravfbeqpputguduytemrxrxlshpskxrbaphbtzrivmpsplqkreeovdankrhxqzyqqhsjjluezlwqyobpshgpkiewbmtrnuidbcmmpirotpgrghjaqpqazuzaistvmbyqfncuvvkrnritattriltjgujonfmzikrozukxrvoeoyxosthc");
        System.out.println(result);
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

import java.io.*;
import java.util.*;
public class TreeCheck {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        String input = "(P,J) (X,T) (R,E) (P,C) (X,B) (R,X)";
        
        
        //
        String[] arr = input.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        HashMap<String,Integer> map4 = new HashMap<String,Integer>();
        for(String sc: arr){  
            
            if(sc.equals("") || ( sc.charAt(0) != '(' || sc.charAt(sc.length()-1) != ')' ) ){
                System.out.print("E1");
                break;
            }            
            else{
                
                if(map.containsKey(sc)) {
                    System.out.print("E2");
                    break;
                }                   
                else map.put(sc,1);                
                
                String[] sComma = sc.substring(1,sc.length()-1).split(",");                
                if(map.containsKey(sComma[0])) map.put(sComma[0],map.get(sComma[0])+1);
                else map.put(sComma[0],1);
                
                String[] s4 = sc.substring(1,sc.length()-1).split(",");                
                if(map4.containsKey(s4[1])) map4.put(s4[1],map4.get(s4[1])+1);
                else map4.put(s4[1],1);
                                
            }
        }
        
        int cnt=0;
        for(String hMap: map.keySet()){            
            if(map.get(hMap)>2){
                System.out.print("E3");
                break;
            }
            else{
                
                if(!map4.containsKey(hMap) && hMap.length()==1){
                    cnt++;
                }
                
            }
        }
         
        if(cnt>1){
            System.out.print("E4");            
        }
                   
        
    }
}
import java.util.HashMap;


class Main {
  public static void main(String[] args) {
    
   int i = solution("abaacbca", 2);
   System.out.println(i);
  }
  
  public static int solution(String S, int K) {
      
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      
      char[] c = S.toCharArray();
      
      for(char cT: c){
          if(map.containsKey(cT)) 
              map.put(cT,map.get(cT)+1);
          else 
              map.put(cT,1);
      }
      int zeros = map.size() - K;
      
      
      if(zeros>0){
          
          int lengthOfSubstring = 0;
          for(int i=0;i<c.length;i++){
              HashMap<Character,Integer> map4 =  new HashMap<Character,Integer>();
              map4 = map;
              int countZeros = 0;
              for(int j=i; j<c.length ;j++){
                  if(map4.containsKey(c[j])) map4.put(c[j],map4.get(c[j])-1);
                  if(map4.get(c[j])==0){
                    countZeros += 1;
                  }
                  if(countZeros == zeros && lengthOfSubstring < i-j){
                      lengthOfSubstring = i-j;
                      break;
                  }
              }
          }
          return lengthOfSubstring;
          
      }else return -1;
      
  }
}
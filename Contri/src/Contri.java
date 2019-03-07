
public class Contri {

	public static void main(String[] args) {
		
		int[] A = new int[]{4, 2, 1};
		int[] B = new int[]{2, 5, 3};
		int F = 2;
		
		System.out.println(solution(A,B,F));
	}
	
	public static int solution(int[] A, int[] B, int F) {
        
        int Ba = A.length - F;
        int N = F+Ba;        
        int n = A.length;        
        
        int contri = 0;
        for(int i = 0; i < N; i++){
            if(A[i] >= B[i] && F != 0){
                contri += A[i];
                F--;
            }else if(Ba>0 && F==0) {
            	contri += B[i];
            	Ba--;
            	continue;
            }
            
            if(A[i] < B[i] && Ba != 0){
                contri += B[i];
                Ba--;
            }else if(F>0 && Ba==0) {
            	contri += A[i];
            	F--;
            	continue;
            }
        }
        
        
        return contri;
        
    }

}

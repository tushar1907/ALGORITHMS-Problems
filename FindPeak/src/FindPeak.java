
public class FindPeak {

	public static void main(String[] args) {
		
		int arr[] = new int[] {2, 5	, 3, 1, 4};
		
		findLight(arr);
		
		
	}
	
	public static void findLight(int[] arr) {
		int l = arr.length;
        int[] on = new int[l];
        int[] shine = new int[l];
        int moment = 0;
        
        for(int i=0;i<l;i++) {
        	on[arr[i]-1] = 1;
        	if(arr[i] != 1) {
        		if(shine[arr[i]-2] == 1) {
        			shine[arr[i] - 1] = 1;
        		}
        	}else {
        		shine[arr[i] - 1] = 1;
        	}
        	
        	for(int j=arr[i];j<l;j++) {
        		if(shine[j-1]==1 && on[j]==1) {
        			shine[j]=1;
        		}else break;
        	}
        	boolean flag = true;
        	for(int k=0;k<l;k++) {
        		if(on[k]==1) {
        			if(shine[k]==1) {
        				continue;
        			}else flag = false;
        		}
        	}
        	
        	if(flag==true) {
        		moment++;
        	}
        }
        
        System.out.println(moment);
        
    }
}

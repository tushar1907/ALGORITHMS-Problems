
public class Histo {

	int[] A = new int[9];

	public Histo(int[] A) {
		this.A = A;
	}

	public static void main(String[] args) {

		int[] A = new int[] { 99, 88, 77, 66, 55, 44, 33, 22, 11};

		Histo histo = new Histo(A);
		
		int[] result = histo.get_histo();	

	}

	public int[] get_histo() {

		int[] r = new int[]{0,0,0,0,0,0,0,0,0,0};

		for (int i = 0; i < 8; i++) {
			if (A[i] <= 9) {
				r[0]++;
			}
			if (A[i] <= 19) {
				r[1]++;
			}
			if (A[i] <= 29) {
				r[2]++;
			}
			if (A[i] <= 39) {
				r[3]++;
			}
			if (A[i] <= 49) {
				r[4]++;
			}
			if (A[i] <= 59) {
				r[5]++;
			}
			if (A[i] <= 69) {
				r[6]++;
			}
			if (A[i] <= 79) {
				r[7]++;
			}
			if (A[i] <= 89) {
				r[8]++;
			}
			if (A[i] <= 99) {
				r[9]++;
			}		

		}
		int total = 0;
		for(int j = 0; j < 10; j++) {
			total += r[j];
		}
		
		for(int k = 0; k < 10; k++) {
			r[k] = r[k]/total;
		}
		
		return r;

	}

}

package main



type Histo struct {  
    A Array;
}

func main() {  
    e := Histo {
        A: [9]int{ 99, 88, 77, 66, 55, 44, 33, 22, 11}
    }

    var res = e.get_histo();
}

func (h Histo) get_histo() {  
	var r [9]int

	for i := 0; i < 10; i++ {
		if A[i] <= 9 {
			r[0]++;
		}
		if A[i] <= 19 {
			r[1]++;
		}
		if A[i] <= 29 {
			r[2]++;
		}
		if A[i] <= 39 {
			r[3]++;
		}
		if A[i] <= 49 {
			r[4]++;
		}
		if A[i] <= 59 {
			r[5]++;
		}
		if A[i] <= 69 {
			r[6]++;
		}
		if A[i] <= 79 {
			r[7]++;
		}
		if A[i] <= 89 {
			r[8]++;
		}
		if A[i] <= 99 {
			r[9]++;
		}		

	}
	var total = 0;
	for j := 0; j < 10; j++ {
		total := total + r[j];
	}
	
	for k := 0; k < 10; k++ {
		r[k] := r[k]/total;
	}
	
	return r;
}
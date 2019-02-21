// --- Directions
// Implement bubbleSort, selectionSort, and mergeSort

function bubbleSort(arr) {

    for(let i=0; i < arr.length; i++){
        for(let j=0; j < (arr.length-i-1); j++){
            if(arr[j] > arr[j+1]){
                const lesser = arr[j+1];
                arr[j+1]=arr[j];
                arr[j] = lesser;
            }
        }
    }
    return arr;
}

function selectionSort(arr) {

 
        for (let i = 0; i < arr.length; i++) {
         let indexOfMin = i;
         for (let j = i + 1; j < arr.length; j++) {
          if (arr[indexOfMin] > arr[j]) {
           const greater = arr[indexOfMin];
           arr[indexOfMin] = arr[j];
           arr[j] = greater;
          }
         }
        }
        return arr;
    }

function mergeSort(arr) {

    if(arr.length == 1){
        return arr;
    }

    const center = Math.floor(arr.length/2);

    const left = arr.slice(0, center)

    const right = arr.slice(center)

    return merge(mergeSort(left),mergeSort(right));
}

function merge(left, right) {

    const result = []
    while(left.length && right.length){
        if(left[0] < right[0]){
            result.push(left.shift())
        }
        else{
            result.push(right.shift())
        }
    }

    return [...result, ...left, ...right];
}

function quickSort(arr){
    return quickSortArray(arr,0,arr.length-1);
}

function quickSortArray(arr, left, right){
    if(left>=right) return;

    let pivot =arr[(left+right)/2];
    
    let index = partition(arr, left, right, pivot);

    quickSortArray(arr,left,index-1);

    quickSortArray(arr,index+1, right);

}

function partition(arr, left, right, pivot){
    while(left<=right){
        while(arr[left] < pivot){
            left++;
        }
        while(arr[right] > pivot){
            right--;
        }

        if(left<=right){
            let temp = arr[left];
            arr[left] = arr[right];
            arr[righ] = temp;
            left++;
            right--;
        }
    }
    return left;
}

module.exports = { bubbleSort, selectionSort, mergeSort, merge };

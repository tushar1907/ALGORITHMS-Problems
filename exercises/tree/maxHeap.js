class MaxBinaryHeap{
    constructor(){
        this.values = [44,35,33,18,27,12];
    }

    insert(element){
        this.values.push(element);
        this.bubbleUp()
    }

    bubbleUp(){
        let idx = this.values.length - 1;
        const element = this.values[idx];
        while(true){
            let parentidx = Math.floor((idx-1)/2);
            let parent = this.values[parentidx];
            if(element <= parent) break;
            this.values[parentidx] = element;
            this.values[idx] = parent;
            idx = parentidx;
        }
    }
}

let heap = new MaxBinaryHeap();
heap.insert(55);
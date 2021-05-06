import java.util.ArrayList;
//priority is the largest

public class PriorityHeap {
    int[] heap;
    int iteration = 0;
    PriorityHeap(int size){
        heap = new int[size + 1];
        iteration ++;
    }
    public void insert(int item){
        heap[iteration] = item;
        insert(item, iteration);
        iteration++;
    }
    public void insert(int item, int index){
        if(index <= 1){return;}
        int parentIndex = getParentIndex(index);
        if(heap[parentIndex] < item){
            heap[index] = heap[parentIndex];
            heap[parentIndex] = item;
            insert(item, parentIndex);
        }
        return;
    }
    public int getParentIndex(int index){
        if(index % 2 == 0){
            return index / 2;
        }
        return (index - 1)/2;
    }

    public void printTree() {
        for(int i: heap){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PriorityHeap heap = new PriorityHeap(20);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.insert(7);
        heap.printTree();
    }

}

public class Main {
    public static void main(String[] args) {
        leftistHeap<Integer> heap = new leftistHeap<>();
        heap.Merge(3);
        heap.Merge(4);
        heap.Merge(2);
        heap.Merge(7);
        heap.Merge(10);
        heap.Merge(11);
        heap.Merge(1);
        heap.printLeftistHeap();
    }
}

public class LeftistHeap <E extends Comparable<E>> {
    Node root;
    LeftistHeap(){}

    public void insert(E item){
        root = insert(item, root);
    }
    public Node insert(E item, Node node){
        if(node == null){
            return new Node(item, 0);
        }
        if(item.compareTo(node.element) > 0){
            node.right =  insert(item, node.right);
            setNPL(node);
            check(node);
            return node;
        }
        Node currNode = new Node(item, 0);
        currNode.left = node;
        return currNode;
    }
    public void check(Node node){
        if(node.left == null){
            node.left = node.right;
            node.right = null;
        } else if (node.right.npl > node.left.npl){
            Node left = node.left;
            node.left = node.right;
            node.right = left;
        }
    }
    public void setNPL(Node node){
        if(node.left == null || node.right == null){
            node.npl = 0;
        } else {
            if(node.left.npl < node.right.npl){node.npl = 1 + node.left.npl;}
            else {node.npl = 1 + node.right.npl;}
        }
    }

    public void printTree(){
        printTree(root, "");
    }
    public void printTree(Node node, String indentation){
        if(node == null){return;}
        printTree(node.right, indentation + " ");
        System.out.println(indentation + node.element + "(" + node.npl + ")");
        printTree(node.left, indentation + " ");
    }

    class Node {
        Node left;
        Node right;
        int npl;
        E element;
        Node(E e) {
            element = e;
        }

        Node(E e, int n){
            element = e;
            npl = n;
        }
    }

    public static void main(String[] args) {
        LeftistHeap<Integer> heap = new LeftistHeap<>();
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.insert(2);
        heap.insert(6);
        heap.insert(1);
        heap.insert(7);
        heap.insert(5);
        heap.insert(9);
        heap.insert(6);
        heap.insert(11);
        heap.printTree();




    }

}
